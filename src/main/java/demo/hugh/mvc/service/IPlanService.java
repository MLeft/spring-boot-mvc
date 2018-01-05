package demo.hugh.mvc.service;

import java.util.List;
import java.util.Map;

import demo.hugh.mvc.bean.BaseResBean;
import demo.hugh.mvc.dto.Plan;

/**
 * 御魂组合计算
 * 
 * @author Think
 *
 */
public interface IPlanService {

	/**
	 * 根据筛选参数, 列出符合要求的御魂组合
	 * 
	 * @param paramMap
	 * @return
	 */
	List<Plan> getPerfectPlan(Map<String, String> paramMap);

	/**
	 * 列出所有御魂组合方案
	 * 
	 * @return
	 */
	List<Plan> getAllPlan();

	/**
	 * 保存组合
	 * 
	 * @param plan
	 * @return
	 */
	public BaseResBean savePlan(Plan plan);
}
