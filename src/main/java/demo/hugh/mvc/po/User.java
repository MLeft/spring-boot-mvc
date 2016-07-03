package demo.hugh.mvc.po;

import java.util.Date;

public class User {
    /**
     * <pre>
     * 
     * 表字段 : user.id
     * </pre>
     * 
     */
    private Integer id;

    /**
     * <pre>
     * 用户号，全局唯一，只允许字母和数字
     * 表字段 : user.user_no
     * </pre>
     * 
     */
    private String userNo;

    /**
     * <pre>
     * 
     * 表字段 : user.login_name
     * </pre>
     * 
     */
    private String loginName;

    /**
     * <pre>
     * 
     * 表字段 : user.password
     * </pre>
     * 
     */
    private String password;

    /**
     * <pre>
     * 用于显示的用户名
     * 表字段 : user.user_name
     * </pre>
     * 
     */
    private String userName;

    /**
     * <pre>
     * 
     * 表字段 : user.birthday
     * </pre>
     * 
     */
    private Date birthday;

    /**
     * <pre>
     * 是否农历生日
     * 表字段 : user.is_lunar
     * </pre>
     * 
     */
    private Boolean isLunar;

    /**
     * <pre>
     * 用户头像
     * 表字段 : user.avatar
     * </pre>
     * 
     */
    private String avatar;

    /**
     * <pre>
     * 
     * 表字段 : user.bound_mobile
     * </pre>
     * 
     */
    private String boundMobile;

    /**
     * <pre>
     * 
     * 表字段 : user.bound_email
     * </pre>
     * 
     */
    private String boundEmail;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Boolean getIsLunar() {
        return isLunar;
    }

    public void setIsLunar(Boolean isLunar) {
        this.isLunar = isLunar;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getBoundMobile() {
        return boundMobile;
    }

    public void setBoundMobile(String boundMobile) {
        this.boundMobile = boundMobile;
    }

    public String getBoundEmail() {
        return boundEmail;
    }

    public void setBoundEmail(String boundEmail) {
        this.boundEmail = boundEmail;
    }
}