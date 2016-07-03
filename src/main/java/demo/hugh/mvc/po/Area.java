package demo.hugh.mvc.po;

public class Area {
    private Integer id;

    private Integer areaCode;

    private String name;

    private Integer fatherCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(Integer areaCode) {
        this.areaCode = areaCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFatherCode() {
        return fatherCode;
    }

    public void setFatherCode(Integer fatherCode) {
        this.fatherCode = fatherCode;
    }
}