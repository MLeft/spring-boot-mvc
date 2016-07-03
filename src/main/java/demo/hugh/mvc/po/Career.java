package demo.hugh.mvc.po;

import java.util.Date;

public class Career {
    /**
     * <pre>
     * 
     * 表字段 : career.id
     * </pre>
     * 
     */
    private Integer id;

    /**
     * <pre>
     * 
     * 表字段 : career.user_id
     * </pre>
     * 
     */
    private Integer userId;

    /**
     * <pre>
     * 
     * 表字段 : career.company_id
     * </pre>
     * 
     */
    private Integer companyId;

    /**
     * <pre>
     * 
     * 表字段 : career.company_name
     * </pre>
     * 
     */
    private String companyName;

    /**
     * <pre>
     * 
     * 表字段 : career.company_name_en
     * </pre>
     * 
     */
    private String companyNameEn;

    /**
     * <pre>
     * 
     * 表字段 : career.office_number
     * </pre>
     * 
     */
    private String officeNumber;

    /**
     * <pre>
     * 
     * 表字段 : career.office_email
     * </pre>
     * 
     */
    private String officeEmail;

    /**
     * <pre>
     * 
     * 表字段 : career.department
     * </pre>
     * 
     */
    private String department;

    /**
     * <pre>
     * 
     * 表字段 : career.title
     * </pre>
     * 
     */
    private String title;

    /**
     * <pre>
     * 
     * 表字段 : career.begin_date
     * </pre>
     * 
     */
    private Date beginDate;

    /**
     * <pre>
     * 
     * 表字段 : career.end_date
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

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyNameEn() {
        return companyNameEn;
    }

    public void setCompanyNameEn(String companyNameEn) {
        this.companyNameEn = companyNameEn;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }

    public String getOfficeEmail() {
        return officeEmail;
    }

    public void setOfficeEmail(String officeEmail) {
        this.officeEmail = officeEmail;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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