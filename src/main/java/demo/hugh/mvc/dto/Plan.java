package demo.hugh.mvc.dto;

import java.util.ArrayList;
import java.util.List;

import demo.hugh.mvc.po.Yuhun;

public class Plan {

	String planId;
	String planName;
	List<Yuhun> plan = new ArrayList<>();

	String buffAttack; // 攻击
	String buffAttackPercent; // 攻击加成
	String buffCritRate; // 暴击率
	String buffCriticalDamage; // 暴击伤害

	public String getPlanId() {
		return planId;
	}

	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public List<Yuhun> getPlan() {
		return plan;
	}

	public void setPlan(List<Yuhun> plan) {
		this.plan = plan;
	}

	public String getBuffAttack() {
		return buffAttack;
	}

	public void setBuffAttack(String buffAttack) {
		this.buffAttack = buffAttack;
	}

	public String getBuffAttackPercent() {
		return buffAttackPercent;
	}

	public void setBuffAttackPercent(String buffAttackPercent) {
		this.buffAttackPercent = buffAttackPercent;
	}

	public String getBuffCritRate() {
		return buffCritRate;
	}

	public void setBuffCritRate(String buffCritRate) {
		this.buffCritRate = buffCritRate;
	}

	public String getBuffCriticalDamage() {
		return buffCriticalDamage;
	}

	public void setBuffCriticalDamage(String buffCriticalDamage) {
		this.buffCriticalDamage = buffCriticalDamage;
	}
}
