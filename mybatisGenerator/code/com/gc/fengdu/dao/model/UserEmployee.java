package com.gc.fengdu.dao.model;

import com.gc.frame.core.base.CoreEntity;
import java.util.Date;

public class UserEmployee extends CoreEntity {
    private Integer id;

    private Integer userId;

    private Integer employeeId;

    private Date sortId;

    private Date createTime;

    private Integer createAccount;

    private Date modifyTime;

    private Integer modifyAccount;

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

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Date getSortId() {
        return sortId;
    }

    public void setSortId(Date sortId) {
        this.sortId = sortId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateAccount() {
        return createAccount;
    }

    public void setCreateAccount(Integer createAccount) {
        this.createAccount = createAccount;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getModifyAccount() {
        return modifyAccount;
    }

    public void setModifyAccount(Integer modifyAccount) {
        this.modifyAccount = modifyAccount;
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
        UserEmployee other = (UserEmployee) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getEmployeeId() == null ? other.getEmployeeId() == null : this.getEmployeeId().equals(other.getEmployeeId()))
            && (this.getSortId() == null ? other.getSortId() == null : this.getSortId().equals(other.getSortId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getCreateAccount() == null ? other.getCreateAccount() == null : this.getCreateAccount().equals(other.getCreateAccount()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()))
            && (this.getModifyAccount() == null ? other.getModifyAccount() == null : this.getModifyAccount().equals(other.getModifyAccount()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getEmployeeId() == null) ? 0 : getEmployeeId().hashCode());
        result = prime * result + ((getSortId() == null) ? 0 : getSortId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getCreateAccount() == null) ? 0 : getCreateAccount().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        result = prime * result + ((getModifyAccount() == null) ? 0 : getModifyAccount().hashCode());
        return result;
    }
}