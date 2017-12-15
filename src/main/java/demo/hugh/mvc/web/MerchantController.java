package demo.hugh.mvc.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

import demo.hugh.mvc.dto.TranFlowDto;
import demo.hugh.mvc.service.LogCatService;
import demo.hugh.mvc.service.TranFlowService;

@Controller
@RequestMapping("/mer")
public class MerchantController {

	@Resource
	private TranFlowService tranFlowServiceImpl;

	@Resource
	private LogCatService logCatServiceImpl;

	@RequestMapping(value = "/query", method = RequestMethod.POST)
	@ResponseBody
	public Object query(
			@RequestParam String merchantNo, 
			@RequestParam String merOrderId,
			@RequestParam String tranType) {
		JSONObject jo = new JSONObject();
		jo.put("log", "");
		jo.put("status", "未通过");
		jo.put("tranBus", "");
		jo.put("email", "");

		// 查询流水
		TranFlowDto dto = tranFlowServiceImpl.getTranFlowService(merchantNo, merOrderId);

		if (dto == null) {
			String logs = logCatServiceImpl.cat(tranType, merOrderId, null);
			if (null == logs || logs.isEmpty()) {
				logs = "交易记录不存在";
			}
			jo.put("log", logs);
		} else {
			// 判断交易类型
			tranType = dto.getTranType();
			String logs = logCatServiceImpl.cat(tranType, merOrderId, null);
			jo.put("log", logs);
			if ("1".equals(dto.getIsNotify())) {
				jo.put("status", "通过");
				if (dto.getTranType().startsWith("AGENT")) {
					jo.put("email", "wangxu@jytpay.com");
				} else if (dto.getTranType().startsWith("ONEPAY")) {
					jo.put("email", "zhangxudong@jytpay.com");
				} else if (dto.getTranType().equals("AUTH")) {
					jo.put("email", "wangheng@jytpay.com");
				} else if (dto.getTranType().equals("RNPAY")) {
					jo.put("email", "liyabin@jytpay.com");
				}
			}
			jo.put("tranBus", dto.getTranType());
		}

		return jo;
	}
}
