package demo.hugh.mvc.service;

import java.util.List;

import demo.hugh.mvc.po.Yuhun;

public interface IYuhunService {

	Yuhun select(int id);

	List<Yuhun> selectByUserId(int userId);

	List<Yuhun> selectByPlanId(int userId, int planId);
}
