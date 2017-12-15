package demo.hugh.mvc.serviceImpl;

import java.util.Comparator;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import demo.hugh.mvc.dto.TranFlowDto;
import demo.hugh.mvc.mapper.TranFlowMapper;
import demo.hugh.mvc.service.TranFlowService;

@Service
public class TranFlowServiceImpl implements TranFlowService {

	private Logger log = LoggerFactory.getLogger(TranFlowServiceImpl.class);

	@Resource
	private TranFlowMapper tranFlowMapper;

	@Override
	public TranFlowDto getTranFlowService(String merchantNo, String merOrderId) {
		List<TranFlowDto> list = tranFlowMapper.listTranFlow(merchantNo, merOrderId);
		if (list == null || list.size() == 0) {
			return null;
		} else if (list.size() > 1) {
			log.debug("商户号{}下有多条订单号为{}的记录: {}, 取最新的一条返回", merchantNo, merOrderId, JSON.toJSONString(list));
			list.sort(new Comparator<TranFlowDto>() {

				@Override
				public int compare(TranFlowDto o1, TranFlowDto o2) {
					return o2.getCreateTime().compareTo(o1.getCreateTime());
				}

			});
			log.debug("取出最新一条: {}", JSON.toJSONString(list.get(0)));
		}
		return list.get(0);
	}

}
