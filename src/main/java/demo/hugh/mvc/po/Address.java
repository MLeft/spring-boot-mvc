package demo.hugh.mvc.po;

import java.util.Date;

public class Address {
    /**
     * <pre>
     * 
     * 表字段 : address.id
     * </pre>
     * 
     */
    private Integer id;

    /**
     * <pre>
     * 
     * 表字段 : address.user_id
     * </pre>
     * 
     */
    private Integer userId;

    /**
     * <pre>
     * 国家
     * 表字段 : address.country
     * </pre>
     * 
     */
    private Integer country;

    /**
     * <pre>
     * 省
     * 表字段 : address.province
     * </pre>
     * 
     */
    private Integer province;

    /**
     * <pre>
     * 市
     * 表字段 : address.city
     * </pre>
     * 
     */
    private Integer city;

    /**
     * <pre>
     * 县区
     * 表字段 : address.county
     * </pre>
     * 
     */
    private Integer county;

    /**
     * <pre>
     * 详细住址
     * 表字段 : address.address
     * </pre>
     * 
     */
    private String address;

    /**
     * <pre>
     * 
     * 表字段 : address.begin_date
     * </pre>
     * 
     */
    private Date beginDate;

    /**
     * <pre>
     * 
     * 表字段 : address.end_date
     * </pre>
     * 
     */
    private Date endDate;

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

    public Integer getCountry() {
        return country;
    }

    public void setCountry(Integer country) {
        this.country = country;
    }

    public Integer getProvince() {
        return province;
    }

    public void setProvince(Integer province) {
        this.province = province;
    }

    public Integer getCity() {
        return city;
    }

    public void setCity(Integer city) {
        this.city = city;
    }

    public Integer getCounty() {
        return county;
    }

    public void setCounty(Integer county) {
        this.county = county;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}