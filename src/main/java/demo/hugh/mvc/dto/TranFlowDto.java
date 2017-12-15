package demo.hugh.mvc.dto;

import java.util.Date;

public class TranFlowDto {

	private String merchantNo;

	private String merOrderId;

	private String tranType;

	private String tranFlowId;

	private String noticeId;

	private String isNotify; // 0 待通知, 1 已通知

	private String notifyCount;

	private Date createTime;

	public String getMerchantNo() {
		return merchantNo;
	}

	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}

	public String getMerOrderId() {
		return merOrderId;
	}

	public void setMerOrderId(String merOrderId) {
		this.merOrderId = merOrderId;
	}

	public String getTranType() {
		return tranType;
	}

	public void setTranType(String tranType) {
		this.tranType = tranType;
	}

	public String getTranFlowId() {
		return tranFlowId;
	}

	public void setTranFlowId(String tranFlowId) {
		this.tranFlowId = tranFlowId;
	}

	public String getNoticeId() {
		return noticeId;
	}

	public void setNoticeId(String noticeId) {
		this.noticeId = noticeId;
	}

	public String getIsNotify() {
		return isNotify;
	}

	public void setIsNotify(String isNotify) {
		this.isNotify = isNotify;
	}

	public String getNotifyCount() {
		return notifyCount;
	}

	public void setNotifyCount(String notifyCount) {
		this.notifyCount = notifyCount;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
