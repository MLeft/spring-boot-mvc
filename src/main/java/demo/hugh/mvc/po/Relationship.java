package demo.hugh.mvc.po;

public class Relationship {
    private Integer id;

    private String relationship;

    private Integer relationWeigth;

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