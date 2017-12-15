package demo.hugh.mvc.service;

import demo.hugh.mvc.dto.TranFlowDto;

public interface TranFlowService {

	public TranFlowDto getTranFlowService(String merchantNo, String merOrderId);
}
