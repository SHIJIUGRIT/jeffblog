package com.jeffryProject.entity;

import java.util.Date;

public class Message {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jeff_message.msgid
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    private Integer msgid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jeff_message.pmsgid
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    private Integer pmsgid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jeff_message.msg_name
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    private String msgName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jeff_message.msg_detial
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    private String msgDetial;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jeff_message.email
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jeff_message.personal_url
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    private String personalUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jeff_message.msg_time
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    private Date msgTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jeff_message.msgid
     *
     * @return the value of jeff_message.msgid
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    public Integer getMsgid() {
        return msgid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jeff_message.msgid
     *
     * @param msgid the value for jeff_message.msgid
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    public void setMsgid(Integer msgid) {
        this.msgid = msgid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jeff_message.pmsgid
     *
     * @return the value of jeff_message.pmsgid
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    public Integer getPmsgid() {
        return pmsgid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jeff_message.pmsgid
     *
     * @param pmsgid the value for jeff_message.pmsgid
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    public void setPmsgid(Integer pmsgid) {
        this.pmsgid = pmsgid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jeff_message.msg_name
     *
     * @return the value of jeff_message.msg_name
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    public String getMsgName() {
        return msgName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jeff_message.msg_name
     *
     * @param msgName the value for jeff_message.msg_name
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    public void setMsgName(String msgName) {
        this.msgName = msgName == null ? null : msgName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jeff_message.msg_detial
     *
     * @return the value of jeff_message.msg_detial
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    public String getMsgDetial() {
        return msgDetial;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jeff_message.msg_detial
     *
     * @param msgDetial the value for jeff_message.msg_detial
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    public void setMsgDetial(String msgDetial) {
        this.msgDetial = msgDetial == null ? null : msgDetial.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jeff_message.email
     *
     * @return the value of jeff_message.email
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jeff_message.email
     *
     * @param email the value for jeff_message.email
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jeff_message.personal_url
     *
     * @return the value of jeff_message.personal_url
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    public String getPersonalUrl() {
        return personalUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jeff_message.personal_url
     *
     * @param personalUrl the value for jeff_message.personal_url
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    public void setPersonalUrl(String personalUrl) {
        this.personalUrl = personalUrl == null ? null : personalUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jeff_message.msg_time
     *
     * @return the value of jeff_message.msg_time
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    public Date getMsgTime() {
        return msgTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jeff_message.msg_time
     *
     * @param msgTime the value for jeff_message.msg_time
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    public void setMsgTime(Date msgTime) {
        this.msgTime = msgTime;
    }
}