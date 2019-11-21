package com.demo.crowd.entity;

import java.io.Serializable;

/**
 * t_member
 * @author 
 */
public class MemberPO implements Serializable {
    /**
     * 主键id
     */
    private Long id;

    private String loginacct;

    private String userpswd;

    private String username;

    private String email;

    /**
     * 实名认证状态 0：未实名 1：实名认证申请 2：已实名
     */
    private Byte authstatus;

    /**
     * 0 个人 1 企业
     */
    private Byte usertype;

    private String realname;

    private String cardnum;

    /**
     * 0 企业 1个体 2个人 3政府
     */
    private Byte accttype;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoginacct() {
        return loginacct;
    }

    public void setLoginacct(String loginacct) {
        this.loginacct = loginacct;
    }

    public String getUserpswd() {
        return userpswd;
    }

    public void setUserpswd(String userpswd) {
        this.userpswd = userpswd;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Byte getAuthstatus() {
        return authstatus;
    }

    public void setAuthstatus(Byte authstatus) {
        this.authstatus = authstatus;
    }

    public Byte getUsertype() {
        return usertype;
    }

    public void setUsertype(Byte usertype) {
        this.usertype = usertype;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getCardnum() {
        return cardnum;
    }

    public void setCardnum(String cardnum) {
        this.cardnum = cardnum;
    }

    public Byte getAccttype() {
        return accttype;
    }

    public void setAccttype(Byte accttype) {
        this.accttype = accttype;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        MemberPO other = (MemberPO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLoginacct() == null ? other.getLoginacct() == null : this.getLoginacct().equals(other.getLoginacct()))
            && (this.getUserpswd() == null ? other.getUserpswd() == null : this.getUserpswd().equals(other.getUserpswd()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getAuthstatus() == null ? other.getAuthstatus() == null : this.getAuthstatus().equals(other.getAuthstatus()))
            && (this.getUsertype() == null ? other.getUsertype() == null : this.getUsertype().equals(other.getUsertype()))
            && (this.getRealname() == null ? other.getRealname() == null : this.getRealname().equals(other.getRealname()))
            && (this.getCardnum() == null ? other.getCardnum() == null : this.getCardnum().equals(other.getCardnum()))
            && (this.getAccttype() == null ? other.getAccttype() == null : this.getAccttype().equals(other.getAccttype()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getLoginacct() == null) ? 0 : getLoginacct().hashCode());
        result = prime * result + ((getUserpswd() == null) ? 0 : getUserpswd().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getAuthstatus() == null) ? 0 : getAuthstatus().hashCode());
        result = prime * result + ((getUsertype() == null) ? 0 : getUsertype().hashCode());
        result = prime * result + ((getRealname() == null) ? 0 : getRealname().hashCode());
        result = prime * result + ((getCardnum() == null) ? 0 : getCardnum().hashCode());
        result = prime * result + ((getAccttype() == null) ? 0 : getAccttype().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", loginacct=").append(loginacct);
        sb.append(", userpswd=").append(userpswd);
        sb.append(", username=").append(username);
        sb.append(", email=").append(email);
        sb.append(", authstatus=").append(authstatus);
        sb.append(", usertype=").append(usertype);
        sb.append(", realname=").append(realname);
        sb.append(", cardnum=").append(cardnum);
        sb.append(", acctype=").append(accttype);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}