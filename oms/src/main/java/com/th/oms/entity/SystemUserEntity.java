package com.th.oms.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "system_user", schema = "thoms", catalog = "")
public class SystemUserEntity {
    private String userId;
    private String userName;
    private String passwd;
    private String rgid;
    private Integer grade;
    private Integer usertype;
    private Integer dispno;
    private Integer isvailid;
    private String ipdress;
    private Integer isbindip;
    private Integer islocked;
    private String remark;
    private Integer userstat;
    private String empId;
    private String empName;
    private Integer uDelete;
    private Integer userOrder;
    private String comId;
    private String addUserid;
    private Timestamp addTime;
    private String addName;
    private String updUserid;
    private Timestamp updTime;
    private String updName;
    private Timestamp uTime;
    private String appUserType;
    private String userAvator;

    @Id
    @Column(name = "USER_ID")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "USER_NAME")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "PASSWD")
    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    @Basic
    @Column(name = "RGID")
    public String getRgid() {
        return rgid;
    }

    public void setRgid(String rgid) {
        this.rgid = rgid;
    }

    @Basic
    @Column(name = "GRADE")
    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    @Basic
    @Column(name = "USERTYPE")
    public Integer getUsertype() {
        return usertype;
    }

    public void setUsertype(Integer usertype) {
        this.usertype = usertype;
    }

    @Basic
    @Column(name = "DISPNO")
    public Integer getDispno() {
        return dispno;
    }

    public void setDispno(Integer dispno) {
        this.dispno = dispno;
    }

    @Basic
    @Column(name = "ISVAILID")
    public Integer getIsvailid() {
        return isvailid;
    }

    public void setIsvailid(Integer isvailid) {
        this.isvailid = isvailid;
    }

    @Basic
    @Column(name = "IPDRESS")
    public String getIpdress() {
        return ipdress;
    }

    public void setIpdress(String ipdress) {
        this.ipdress = ipdress;
    }

    @Basic
    @Column(name = "ISBINDIP")
    public Integer getIsbindip() {
        return isbindip;
    }

    public void setIsbindip(Integer isbindip) {
        this.isbindip = isbindip;
    }

    @Basic
    @Column(name = "ISLOCKED")
    public Integer getIslocked() {
        return islocked;
    }

    public void setIslocked(Integer islocked) {
        this.islocked = islocked;
    }

    @Basic
    @Column(name = "REMARK")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "USERSTAT")
    public Integer getUserstat() {
        return userstat;
    }

    public void setUserstat(Integer userstat) {
        this.userstat = userstat;
    }

    @Basic
    @Column(name = "EMP_ID")
    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    @Basic
    @Column(name = "EMP_NAME")
    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Basic
    @Column(name = "U_DELETE")
    public Integer getuDelete() {
        return uDelete;
    }

    public void setuDelete(Integer uDelete) {
        this.uDelete = uDelete;
    }

    @Basic
    @Column(name = "USER_ORDER")
    public Integer getUserOrder() {
        return userOrder;
    }

    public void setUserOrder(Integer userOrder) {
        this.userOrder = userOrder;
    }

    @Basic
    @Column(name = "COM_ID")
    public String getComId() {
        return comId;
    }

    public void setComId(String comId) {
        this.comId = comId;
    }

    @Basic
    @Column(name = "ADD_USERID")
    public String getAddUserid() {
        return addUserid;
    }

    public void setAddUserid(String addUserid) {
        this.addUserid = addUserid;
    }

    @Basic
    @Column(name = "ADD_TIME")
    public Timestamp getAddTime() {
        return addTime;
    }

    public void setAddTime(Timestamp addTime) {
        this.addTime = addTime;
    }

    @Basic
    @Column(name = "ADD_NAME")
    public String getAddName() {
        return addName;
    }

    public void setAddName(String addName) {
        this.addName = addName;
    }

    @Basic
    @Column(name = "UPD_USERID")
    public String getUpdUserid() {
        return updUserid;
    }

    public void setUpdUserid(String updUserid) {
        this.updUserid = updUserid;
    }

    @Basic
    @Column(name = "UPD_TIME")
    public Timestamp getUpdTime() {
        return updTime;
    }

    public void setUpdTime(Timestamp updTime) {
        this.updTime = updTime;
    }

    @Basic
    @Column(name = "UPD_NAME")
    public String getUpdName() {
        return updName;
    }

    public void setUpdName(String updName) {
        this.updName = updName;
    }

    @Basic
    @Column(name = "U_TIME")
    public Timestamp getuTime() {
        return uTime;
    }

    public void setuTime(Timestamp uTime) {
        this.uTime = uTime;
    }

    @Basic
    @Column(name = "APP_USER_TYPE")
    public String getAppUserType() {
        return appUserType;
    }

    public void setAppUserType(String appUserType) {
        this.appUserType = appUserType;
    }

    @Basic
    @Column(name = "USER_AVATOR")
    public String getUserAvator() {
        return userAvator;
    }

    public void setUserAvator(String userAvator) {
        this.userAvator = userAvator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SystemUserEntity that = (SystemUserEntity) o;
        return Objects.equals(userId, that.userId) &&
                Objects.equals(userName, that.userName) &&
                Objects.equals(passwd, that.passwd) &&
                Objects.equals(rgid, that.rgid) &&
                Objects.equals(grade, that.grade) &&
                Objects.equals(usertype, that.usertype) &&
                Objects.equals(dispno, that.dispno) &&
                Objects.equals(isvailid, that.isvailid) &&
                Objects.equals(ipdress, that.ipdress) &&
                Objects.equals(isbindip, that.isbindip) &&
                Objects.equals(islocked, that.islocked) &&
                Objects.equals(remark, that.remark) &&
                Objects.equals(userstat, that.userstat) &&
                Objects.equals(empId, that.empId) &&
                Objects.equals(empName, that.empName) &&
                Objects.equals(uDelete, that.uDelete) &&
                Objects.equals(userOrder, that.userOrder) &&
                Objects.equals(comId, that.comId) &&
                Objects.equals(addUserid, that.addUserid) &&
                Objects.equals(addTime, that.addTime) &&
                Objects.equals(addName, that.addName) &&
                Objects.equals(updUserid, that.updUserid) &&
                Objects.equals(updTime, that.updTime) &&
                Objects.equals(updName, that.updName) &&
                Objects.equals(uTime, that.uTime) &&
                Objects.equals(appUserType, that.appUserType) &&
                Objects.equals(userAvator, that.userAvator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userName, passwd, rgid, grade, usertype, dispno, isvailid, ipdress, isbindip, islocked, remark, userstat, empId, empName, uDelete, userOrder, comId, addUserid, addTime, addName, updUserid, updTime, updName, uTime, appUserType, userAvator);
    }
}
