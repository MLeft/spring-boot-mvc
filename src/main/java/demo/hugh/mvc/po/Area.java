package demo.hugh.mvc.po;

public class Area {
    /**
     * <pre>
     * 
     * 表字段 : area.id
     * </pre>
     * 
     */
    private Integer id;

    /**
     * <pre>
     * 
     * 表字段 : area.area_code
     * </pre>
     * 
     */
    private Integer areaCode;

    /**
     * <pre>
     * 
     * 表字段 : area.name
     * </pre>
     * 
     */
    private String name;

    /**
     * <pre>
     * 
     * 表字段 : area.father_code
     * </pre>
     * 
     */
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