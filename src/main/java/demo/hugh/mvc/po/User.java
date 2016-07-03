package demo.hugh.mvc.po;

import java.util.Date;

public class User {
    private Integer id;

    private String userNo;

    private String loginName;

    private String password;

    private String userName;

    private Date birthday;

    private Boolean isLunar;

    private String avatar;

    private String boundMobile;

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