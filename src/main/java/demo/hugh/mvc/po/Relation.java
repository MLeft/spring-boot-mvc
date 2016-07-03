package demo.hugh.mvc.po;

import java.util.Date;

public class Relation {
    /**
     * <pre>
     * 
     * 表字段 : relation.id
     * </pre>
     * 
     */
    private Integer id;

    /**
     * <pre>
     * 
     * 表字段 : relation.user_id
     * </pre>
     * 
     */
    private Integer userId;

    /**
     * <pre>
     * 
     * 表字段 : relation.second_user_id
     * </pre>
     * 
     */
    private Integer secondUserId;

    /**
     * <pre>
     * 
     * 表字段 : relation.relationship_id
     * </pre>
     * 
     */
    private Integer relationshipId;

    /**
     * <pre>
     * 
     * 表字段 : relation.appellation
     * </pre>
     * 
     */
    private String appellation;

    /**
     * <pre>
     * 
     * 表字段 : relation.create_time
     * </pre>
     * 
     */
    private Date createTime;

    /**
     * <pre>
     * 
     * 表字段 : relation.remark
     * </pre>
     * 
     */
    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getSecondUserId() {
        return secondUserId;
    }

    public void setSecondUserId(Integer secondUserId) {
        this.secondUserId = secondUserId;
    }

    public Integer getRelationshipId() {
        return relationshipId;
    }

    public void setRelationshipId(Integer relationshipId) {
        this.relationshipId = relationshipId;
    }

    public String getAppellation() {
        return appellation;
    }

    public void setAppellation(String appellation) {
        this.appellation = appellation;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}