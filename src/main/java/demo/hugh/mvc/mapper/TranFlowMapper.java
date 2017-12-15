package demo.hugh.mvc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import demo.hugh.mvc.dto.TranFlowDto;

public interface TranFlowMapper {

	public List<TranFlowDto> listTranFlow(
			@Param("merchantNo") String merchantNo,
			@Param("merOrderId") String merOrderId
			);
}
