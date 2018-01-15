package demo.hugh.mvc.serviceImpl;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import demo.hugh.mvc.service.LogCatService;

@Service
public class LogCatServiceImpl implements LogCatService {

	private Logger log = LoggerFactory.getLogger(LogCatServiceImpl.class);

	@Override
	public String cat(String tranType, String merOrderId, Date date) {
		String os = System.getProperty("os.name");
		if (os.toLowerCase().startsWith("win")) {
			log.warn("windows 下暂不支持应用日志获取");
			return "windows 下暂不支持应用日志获取";
		}
		if (merOrderId == null || merOrderId.isEmpty() || merOrderId.length() < 6 || merOrderId.contains("*")) {
			log.warn("商户流水号{}格式非法", merOrderId);
			return "商户流水号格式非法";
		}
		if (tranType.startsWith("ONEPAY")) {
			tranType = "ONEPAY";
		}
		String cmdstring = "bash /app/config/shell/cat_tomcat_logs.sh " + tranType + " " + merOrderId;
		String logs = null;
		try {
			log.debug("即将shell执行: {}", cmdstring);
			Process proc = Runtime.getRuntime().exec(cmdstring);

			/* 为"错误输出流"单独开一个线程读取之,否则会造成标准输出流的阻塞 */
			Thread t = new Thread(new InputStreamRunnable(proc.getErrorStream(), "ErrorStream"));
			t.start();

			StringBuffer sb = new StringBuffer();
			BufferedReader bf = new BufferedReader(new InputStreamReader(proc.getInputStream()));
			while ((logs = bf.readLine()) != null) {
				sb.append(logs).append("\n");
			}
			logs = sb.toString();
			log.debug("读取到log: {}", logs);
		} catch (Exception e) {
			log.error("", e);
			logs = e.getMessage();
		}
		return logs;
	}

	/**读取InputStream的线程*/  
	class InputStreamRunnable implements Runnable {
		BufferedReader bReader = null;
		String type = null;

		public InputStreamRunnable(InputStream is, String _type) {
			try {
				bReader = new BufferedReader(new InputStreamReader(new BufferedInputStream(is), "UTF-8"));
				type = _type;
			} catch (Exception ex) {
			}
		}

		@Override
		public void run() {
			String line;

			try {
				while ((line = bReader.readLine()) != null) {
					log.error(line);
				}
				bReader.close();
			} catch (Exception ex) {
				log.error("", ex);
			}
		}
	}
}
