package com.th.oms.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "basic_company", schema = "thoms", catalog = "")
public class BasicCompanyEntity {
    private String comId;
    private String comName;
    private String comShortName;
    private String comEnName;
    private Integer comLelvel;
    private String comPy;
    private String comDesc;
    private String comCountry;
    private String comArea;
    private String comProvince;
    private String comZip;
    private String comCity;
    private String comAddress;
    private String comContactman;
    private String comMobile;
    private String comDuty;
    private String comTelphone;
    private String comMail;
    private String comFax;
    private String comBank;
    private String comBankno;
    private String comRegid;
    private String comRegidPath;
    private String comTax;
    private String comTaxPath;
    private String comLicence;
    private String comLicencePath;
    private String comLegalPerson;
    private String comUrl;
    private String comLogo;
    private String comText;
    private String comType;
    private Integer comState;
    private String sysComId;
    private String comUpid;
    private String addUserid;
    private Timestamp addDate;
    private String addName;
    private String updUserid;
    private Timestamp updTime;
    private String updName;
    private Integer uDelete;
    private Timestamp uTime;

    @Id
    @Column(name = "COM_ID")
    public String getComId() {
        return comId;
    }

    public void setComId(String comId) {
        this.comId = comId;
    }

    @Basic
    @Column(name = "COM_NAME")
    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName;
    }

    @Basic
    @Column(name = "COM_SHORT_NAME")
    public String getComShortName() {
        return comShortName;
    }

    public void setComShortName(String comShortName) {
        this.comShortName = comShortName;
    }

    @Basic
    @Column(name = "COM_EN_NAME")
    public String getComEnName() {
        return comEnName;
    }

    public void setComEnName(String comEnName) {
        this.comEnName = comEnName;
    }

    @Basic
    @Column(name = "COM_LELVEL")
    public Integer getComLelvel() {
        return comLelvel;
    }

    public void setComLelvel(Integer comLelvel) {
        this.comLelvel = comLelvel;
    }

    @Basic
    @Column(name = "COM_PY")
    public String getComPy() {
        return comPy;
    }

    public void setComPy(String comPy) {
        this.comPy = comPy;
    }

    @Basic
    @Column(name = "COM_DESC")
    public String getComDesc() {
        return comDesc;
    }

    public void setComDesc(String comDesc) {
        this.comDesc = comDesc;
    }

    @Basic
    @Column(name = "COM_COUNTRY")
    public String getComCountry() {
        return comCountry;
    }

    public void setComCountry(String comCountry) {
        this.comCountry = comCountry;
    }

    @Basic
    @Column(name = "COM_AREA")
    public String getComArea() {
        return comArea;
    }

    public void setComArea(String comArea) {
        this.comArea = comArea;
    }

    @Basic
    @Column(name = "COM_PROVINCE")
    public String getComProvince() {
        return comProvince;
    }

    public void setComProvince(String comProvince) {
        this.comProvince = comProvince;
    }

    @Basic
    @Column(name = "COM_ZIP")
    public String getComZip() {
        return comZip;
    }

    public void setComZip(String comZip) {
        this.comZip = comZip;
    }

    @Basic
    @Column(name = "COM_CITY")
    public String getComCity() {
        return comCity;
    }

    public void setComCity(String comCity) {
        this.comCity = comCity;
    }

    @Basic
    @Column(name = "COM_ADDRESS")
    public String getComAddress() {
        return comAddress;
    }

    public void setComAddress(String comAddress) {
        this.comAddress = comAddress;
    }

    @Basic
    @Column(name = "COM_CONTACTMAN")
    public String getComContactman() {
        return comContactman;
    }

    public void setComContactman(String comContactman) {
        this.comContactman = comContactman;
    }

    @Basic
    @Column(name = "COM_MOBILE")
    public String getComMobile() {
        return comMobile;
    }

    public void setComMobile(String comMobile) {
        this.comMobile = comMobile;
    }

    @Basic
    @Column(name = "COM_DUTY")
    public String getComDuty() {
        return comDuty;
    }

    public void setComDuty(String comDuty) {
        this.comDuty = comDuty;
    }

    @Basic
    @Column(name = "COM_TELPHONE")
    public String getComTelphone() {
        return comTelphone;
    }

    public void setComTelphone(String comTelphone) {
        this.comTelphone = comTelphone;
    }

    @Basic
    @Column(name = "COM_MAIL")
    public String getComMail() {
        return comMail;
    }

    public void setComMail(String comMail) {
        this.comMail = comMail;
    }

    @Basic
    @Column(name = "COM_FAX")
    public String getComFax() {
        return comFax;
    }

    public void setComFax(String comFax) {
        this.comFax = comFax;
    }

    @Basic
    @Column(name = "COM_BANK")
    public String getComBank() {
        return comBank;
    }

    public void setComBank(String comBank) {
        this.comBank = comBank;
    }

    @Basic
    @Column(name = "COM_BANKNO")
    public String getComBankno() {
        return comBankno;
    }

    public void setComBankno(String comBankno) {
        this.comBankno = comBankno;
    }

    @Basic
    @Column(name = "COM_REGID")
    public String getComRegid() {
        return comRegid;
    }

    public void setComRegid(String comRegid) {
        this.comRegid = comRegid;
    }

    @Basic
    @Column(name = "COM_REGID_PATH")
    public String getComRegidPath() {
        return comRegidPath;
    }

    public void setComRegidPath(String comRegidPath) {
        this.comRegidPath = comRegidPath;
    }

    @Basic
    @Column(name = "COM_TAX")
    public String getComTax() {
        return comTax;
    }

    public void setComTax(String comTax) {
        this.comTax = comTax;
    }

    @Basic
    @Column(name = "COM_TAX_PATH")
    public String getComTaxPath() {
        return comTaxPath;
    }

    public void setComTaxPath(String comTaxPath) {
        this.comTaxPath = comTaxPath;
    }

    @Basic
    @Column(name = "COM_LICENCE")
    public String getComLicence() {
        return comLicence;
    }

    public void setComLicence(String comLicence) {
        this.comLicence = comLicence;
    }

    @Basic
    @Column(name = "COM_LICENCE_PATH")
    public String getComLicencePath() {
        return comLicencePath;
    }

    public void setComLicencePath(String comLicencePath) {
        this.comLicencePath = comLicencePath;
    }

    @Basic
    @Column(name = "COM_LEGAL_PERSON")
    public String getComLegalPerson() {
        return comLegalPerson;
    }

    public void setComLegalPerson(String comLegalPerson) {
        this.comLegalPerson = comLegalPerson;
    }

    @Basic
    @Column(name = "COM_URL")
    public String getComUrl() {
        return comUrl;
    }

    public void setComUrl(String comUrl) {
        this.comUrl = comUrl;
    }

    @Basic
    @Column(name = "COM_LOGO")
    public String getComLogo() {
        return comLogo;
    }

    public void setComLogo(String comLogo) {
        this.comLogo = comLogo;
    }

    @Basic
    @Column(name = "COM_TEXT")
    public String getComText() {
        return comText;
    }

    public void setComText(String comText) {
        this.comText = comText;
    }

    @Basic
    @Column(name = "COM_TYPE")
    public String getComType() {
        return comType;
    }

    public void setComType(String comType) {
        this.comType = comType;
    }

    @Basic
    @Column(name = "COM_STATE")
    public Integer getComState() {
        return comState;
    }

    public void setComState(Integer comState) {
        this.comState = comState;
    }

    @Basic
    @Column(name = "SYS_COM_ID")
    public String getSysComId() {
        return sysComId;
    }

    public void setSysComId(String sysComId) {
        this.sysComId = sysComId;
    }

    @Basic
    @Column(name = "COM_UPID")
    public String getComUpid() {
        return comUpid;
    }

    public void setComUpid(String comUpid) {
        this.comUpid = comUpid;
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
    @Column(name = "ADD_DATE")
    public Timestamp getAddDate() {
        return addDate;
    }

    public void setAddDate(Timestamp addDate) {
        this.addDate = addDate;
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
    @Column(name = "U_DELETE")
    public Integer getuDelete() {
        return uDelete;
    }

    public void setuDelete(Integer uDelete) {
        this.uDelete = uDelete;
    }

    @Basic
    @Column(name = "U_TIME")
    public Timestamp getuTime() {
        return uTime;
    }

    public void setuTime(Timestamp uTime) {
        this.uTime = uTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BasicCompanyEntity that = (BasicCompanyEntity) o;
        return Objects.equals(comId, that.comId) &&
                Objects.equals(comName, that.comName) &&
                Objects.equals(comShortName, that.comShortName) &&
                Objects.equals(comEnName, that.comEnName) &&
                Objects.equals(comLelvel, that.comLelvel) &&
                Objects.equals(comPy, that.comPy) &&
                Objects.equals(comDesc, that.comDesc) &&
                Objects.equals(comCountry, that.comCountry) &&
                Objects.equals(comArea, that.comArea) &&
                Objects.equals(comProvince, that.comProvince) &&
                Objects.equals(comZip, that.comZip) &&
                Objects.equals(comCity, that.comCity) &&
                Objects.equals(comAddress, that.comAddress) &&
                Objects.equals(comContactman, that.comContactman) &&
                Objects.equals(comMobile, that.comMobile) &&
                Objects.equals(comDuty, that.comDuty) &&
                Objects.equals(comTelphone, that.comTelphone) &&
                Objects.equals(comMail, that.comMail) &&
                Objects.equals(comFax, that.comFax) &&
                Objects.equals(comBank, that.comBank) &&
                Objects.equals(comBankno, that.comBankno) &&
                Objects.equals(comRegid, that.comRegid) &&
                Objects.equals(comRegidPath, that.comRegidPath) &&
                Objects.equals(comTax, that.comTax) &&
                Objects.equals(comTaxPath, that.comTaxPath) &&
                Objects.equals(comLicence, that.comLicence) &&
                Objects.equals(comLicencePath, that.comLicencePath) &&
                Objects.equals(comLegalPerson, that.comLegalPerson) &&
                Objects.equals(comUrl, that.comUrl) &&
                Objects.equals(comLogo, that.comLogo) &&
                Objects.equals(comText, that.comText) &&
                Objects.equals(comType, that.comType) &&
                Objects.equals(comState, that.comState) &&
                Objects.equals(sysComId, that.sysComId) &&
                Objects.equals(comUpid, that.comUpid) &&
                Objects.equals(addUserid, that.addUserid) &&
                Objects.equals(addDate, that.addDate) &&
                Objects.equals(addName, that.addName) &&
                Objects.equals(updUserid, that.updUserid) &&
                Objects.equals(updTime, that.updTime) &&
                Objects.equals(updName, that.updName) &&
                Objects.equals(uDelete, that.uDelete) &&
                Objects.equals(uTime, that.uTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(comId, comName, comShortName, comEnName, comLelvel, comPy, comDesc, comCountry, comArea, comProvince, comZip, comCity, comAddress, comContactman, comMobile, comDuty, comTelphone, comMail, comFax, comBank, comBankno, comRegid, comRegidPath, comTax, comTaxPath, comLicence, comLicencePath, comLegalPerson, comUrl, comLogo, comText, comType, comState, sysComId, comUpid, addUserid, addDate, addName, updUserid, updTime, updName, uDelete, uTime);
    }
}
