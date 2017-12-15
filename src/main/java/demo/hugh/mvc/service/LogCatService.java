package demo.hugh.mvc.service;

import java.util.Date;

public interface LogCatService {

	/**
	 * 
	 * @param merOrderId 商户流水号
	 * @param date 交易日期
	 * @return 相关日志
	 */
	public String cat(String tranType, String merOrderId, Date date);

}
