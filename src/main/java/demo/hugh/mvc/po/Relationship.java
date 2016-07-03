package demo.hugh.mvc.po;

public class Relationship {
    /**
     * <pre>
     * 
     * 表字段 : relationship.id
     * </pre>
     * 
     */
    private Integer id;

    /**
     * <pre>
     * 
     * 表字段 : relationship.relationship
     * </pre>
     * 
     */
    private String relationship;

    /**
     * <pre>
     * 
     * 表字段 : relationship.relation_weigth
     * </pre>
     * 
     */
    private Integer relationWeigth;

    /**
     * <pre>
     * 
     * 表字段 : relationship.appellations
     * </pre>
     * 
     */
    private String appellations;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public Integer getRelationWeigth() {
        return relationWeigth;
    }

    public void setRelationWeigth(Integer relationWeigth) {
        this.relationWeigth = relationWeigth;
    }

    public String getAppellations() {
        return appellations;
    }

    public void setAppellations(String appellations) {
        this.appellations = appellations;
    }
}