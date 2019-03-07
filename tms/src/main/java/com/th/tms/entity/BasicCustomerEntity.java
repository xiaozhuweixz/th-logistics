package com.th.tms.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "basic_customer", schema = "thtms", catalog = "")
public class BasicCustomerEntity {
    private String custId;
    private String custShortname;
    private String custName;
    private String custPhone;
    private String custFax;
    private String custAddress;
    private String custZip;
    private Integer orgId;
    private String countType;
    private String custMemo;
    private String custAddMan;
    private Date custAddTime;
    private Integer custState;
    private String custPre;
    private Integer custIsPosition;
    private Integer custIsNotice;
    private Double custTarget;
    private Date uTime;
    private String custSign;
    private String custPassword;
    private Integer uDelete;
    private String custLoginName;
    private String comId;
    private String deptId;
    private String custCode;
    private String goodsClass;
    private String custAvator;

    @Id
    @Column(name = "CUST_ID")
    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    @Basic
    @Column(name = "CUST_SHORTNAME")
    public String getCustShortname() {
        return custShortname;
    }

    public void setCustShortname(String custShortname) {
        this.custShortname = custShortname;
    }

    @Basic
    @Column(name = "CUST_NAME")
    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    @Basic
    @Column(name = "CUST_PHONE")
    public String getCustPhone() {
        return custPhone;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }

    @Basic
    @Column(name = "CUST_FAX")
    public String getCustFax() {
        return custFax;
    }

    public void setCustFax(String custFax) {
        this.custFax = custFax;
    }

    @Basic
    @Column(name = "CUST_ADDRESS")
    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    @Basic
    @Column(name = "CUST_ZIP")
    public String getCustZip() {
        return custZip;
    }

    public void setCustZip(String custZip) {
        this.custZip = custZip;
    }

    @Basic
    @Column(name = "ORG_ID")
    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    @Basic
    @Column(name = "COUNT_TYPE")
    public String getCountType() {
        return countType;
    }

    public void setCountType(String countType) {
        this.countType = countType;
    }

    @Basic
    @Column(name = "CUST_MEMO")
    public String getCustMemo() {
        return custMemo;
    }

    public void setCustMemo(String custMemo) {
        this.custMemo = custMemo;
    }

    @Basic
    @Column(name = "CUST_ADD_MAN")
    public String getCustAddMan() {
        return custAddMan;
    }

    public void setCustAddMan(String custAddMan) {
        this.custAddMan = custAddMan;
    }

    @Basic
    @Column(name = "CUST_ADD_TIME")
    public Date getCustAddTime() {
        return custAddTime;
    }

    public void setCustAddTime(Date custAddTime) {
        this.custAddTime = custAddTime;
    }

    @Basic
    @Column(name = "CUST_STATE")
    public Integer getCustState() {
        return custState;
    }

    public void setCustState(Integer custState) {
        this.custState = custState;
    }

    @Basic
    @Column(name = "CUST_PRE")
    public String getCustPre() {
        return custPre;
    }

    public void setCustPre(String custPre) {
        this.custPre = custPre;
    }

    @Basic
    @Column(name = "CUST_IS_POSITION")
    public Integer getCustIsPosition() {
        return custIsPosition;
    }

    public void setCustIsPosition(Integer custIsPosition) {
        this.custIsPosition = custIsPosition;
    }

    @Basic
    @Column(name = "CUST_IS_NOTICE")
    public Integer getCustIsNotice() {
        return custIsNotice;
    }

    public void setCustIsNotice(Integer custIsNotice) {
        this.custIsNotice = custIsNotice;
    }

    @Basic
    @Column(name = "CUST_TARGET")
    public Double getCustTarget() {
        return custTarget;
    }

    public void setCustTarget(Double custTarget) {
        this.custTarget = custTarget;
    }

    @Basic
    @Column(name = "U_TIME")
    public Date getuTime() {
        return uTime;
    }

    public void setuTime(Date uTime) {
        this.uTime = uTime;
    }

    @Basic
    @Column(name = "CUST_SIGN")
    public String getCustSign() {
        return custSign;
    }

    public void setCustSign(String custSign) {
        this.custSign = custSign;
    }

    @Basic
    @Column(name = "CUST_PASSWORD")
    public String getCustPassword() {
        return custPassword;
    }

    public void setCustPassword(String custPassword) {
        this.custPassword = custPassword;
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
    @Column(name = "CUST_LOGIN_NAME")
    public String getCustLoginName() {
        return custLoginName;
    }

    public void setCustLoginName(String custLoginName) {
        this.custLoginName = custLoginName;
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
    @Column(name = "DEPT_ID")
    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    @Basic
    @Column(name = "CUST_CODE")
    public String getCustCode() {
        return custCode;
    }

    public void setCustCode(String custCode) {
        this.custCode = custCode;
    }

    @Basic
    @Column(name = "GOODS_CLASS")
    public String getGoodsClass() {
        return goodsClass;
    }

    public void setGoodsClass(String goodsClass) {
        this.goodsClass = goodsClass;
    }

    @Basic
    @Column(name = "CUST_AVATOR")
    public String getCustAvator() {
        return custAvator;
    }

    public void setCustAvator(String custAvator) {
        this.custAvator = custAvator;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BasicCustomerEntity that = (BasicCustomerEntity) o;
        return Objects.equals(custId, that.custId) &&
                Objects.equals(custShortname, that.custShortname) &&
                Objects.equals(custName, that.custName) &&
                Objects.equals(custPhone, that.custPhone) &&
                Objects.equals(custFax, that.custFax) &&
                Objects.equals(custAddress, that.custAddress) &&
                Objects.equals(custZip, that.custZip) &&
                Objects.equals(orgId, that.orgId) &&
                Objects.equals(countType, that.countType) &&
                Objects.equals(custMemo, that.custMemo) &&
                Objects.equals(custAddMan, that.custAddMan) &&
                Objects.equals(custAddTime, that.custAddTime) &&
                Objects.equals(custState, that.custState) &&
                Objects.equals(custPre, that.custPre) &&
                Objects.equals(custIsPosition, that.custIsPosition) &&
                Objects.equals(custIsNotice, that.custIsNotice) &&
                Objects.equals(custTarget, that.custTarget) &&
                Objects.equals(uTime, that.uTime) &&
                Objects.equals(custSign, that.custSign) &&
                Objects.equals(custPassword, that.custPassword) &&
                Objects.equals(uDelete, that.uDelete) &&
                Objects.equals(custLoginName, that.custLoginName) &&
                Objects.equals(comId, that.comId) &&
                Objects.equals(deptId, that.deptId) &&
                Objects.equals(custCode, that.custCode) &&
                Objects.equals(goodsClass, that.goodsClass) &&
                Objects.equals(custAvator, that.custAvator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(custId, custShortname, custName, custPhone, custFax, custAddress, custZip, orgId, countType, custMemo, custAddMan, custAddTime, custState, custPre, custIsPosition, custIsNotice, custTarget, uTime, custSign, custPassword, uDelete, custLoginName, comId, deptId, custCode, goodsClass, custAvator);
    }
}
