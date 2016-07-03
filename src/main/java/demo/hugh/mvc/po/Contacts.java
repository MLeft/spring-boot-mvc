package demo.hugh.mvc.po;

public class Contacts {
    /**
     * <pre>
     * 
     * 表字段 : contacts.id
     * </pre>
     * 
     */
    private Integer id;

    /**
     * <pre>
     * 
     * 表字段 : contacts.user_id
     * </pre>
     * 
     */
    private Integer userId;

    /**
     * <pre>
     * 名片显示名
     * 表字段 : contacts.card_name
     * </pre>
     * 
     */
    private String cardName;

    /**
     * <pre>
     * 支持逗号分隔
     * 表字段 : contacts.email
     * </pre>
     * 
     */
    private String email;

    /**
     * <pre>
     * 支持逗号分隔
     * 表字段 : contacts.mobile
     * </pre>
     * 
     */
    private String mobile;

    /**
     * <pre>
     * 
     * 表字段 : contacts.wechat
     * </pre>
     * 
     */
    private String wechat;

    /**
     * <pre>
     * 
     * 表字段 : contacts.qq
     * </pre>
     * 
     */
    private String qq;

    /**
     * <pre>
     * 
     * 表字段 : contacts.weibo
     * </pre>
     * 
     */
    private String weibo;

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

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWeibo() {
        return weibo;
    }

    public void setWeibo(String weibo) {
        this.weibo = weibo;
    }
}