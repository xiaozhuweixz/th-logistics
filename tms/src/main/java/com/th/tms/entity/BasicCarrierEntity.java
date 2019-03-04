package com.th.tms.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "basic_carrier", schema = "thtms", catalog = "")
public class BasicCarrierEntity {
    private String carrierId;
    private String carrierName;
    private String carrierShortName;
    private String carrierEnName;
    private String carrierPy;
    private String carrierDesc;
    private String carrierAddress;
    private String carrierContactman;
    private String carrierMobile;
    private String carrierDuty;
    private String carrierTelphone;
    private String carrierMail;
    private String carrierBank;
    private String carrierBankno;
    private String carrierRegid;
    private String carrierRegidPath;
    private String carrierTax;
    private String carrierTaxPath;
    private String carrierLicence;
    private String carrierLicencePath;
    private String carrierLegalPerson;
    private String carrierUrl;
    private String carrierLogo;
    private String carrierText;
    private String addUserid;
    private String addName;
    private Timestamp addDate;
    private Timestamp uTime;
    private Integer uDelete;
    private Timestamp updDate;
    private String updName;
    private Integer carrierState;
    private String comId;
    private String carrierPassw;
    private String carrierRoadTransportPath;
    private String carrierLoginName;
    private String deptId;
    private String dspCode;
    private String dspName;

    @Id
    @Column(name = "CARRIER_ID")
    public String getCarrierId() {
        return carrierId;
    }

    public void setCarrierId(String carrierId) {
        this.carrierId = carrierId;
    }

    @Basic
    @Column(name = "CARRIER_NAME")
    public String getCarrierName() {
        return carrierName;
    }

    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    @Basic
    @Column(name = "CARRIER_SHORT_NAME")
    public String getCarrierShortName() {
        return carrierShortName;
    }

    public void setCarrierShortName(String carrierShortName) {
        this.carrierShortName = carrierShortName;
    }

    @Basic
    @Column(name = "CARRIER_EN_NAME")
    public String getCarrierEnName() {
        return carrierEnName;
    }

    public void setCarrierEnName(String carrierEnName) {
        this.carrierEnName = carrierEnName;
    }

    @Basic
    @Column(name = "CARRIER_PY")
    public String getCarrierPy() {
        return carrierPy;
    }

    public void setCarrierPy(String carrierPy) {
        this.carrierPy = carrierPy;
    }

    @Basic
    @Column(name = "CARRIER_DESC")
    public String getCarrierDesc() {
        return carrierDesc;
    }

    public void setCarrierDesc(String carrierDesc) {
        this.carrierDesc = carrierDesc;
    }

    @Basic
    @Column(name = "CARRIER_ADDRESS")
    public String getCarrierAddress() {
        return carrierAddress;
    }

    public void setCarrierAddress(String carrierAddress) {
        this.carrierAddress = carrierAddress;
    }

    @Basic
    @Column(name = "CARRIER_CONTACTMAN")
    public String getCarrierContactman() {
        return carrierContactman;
    }

    public void setCarrierContactman(String carrierContactman) {
        this.carrierContactman = carrierContactman;
    }

    @Basic
    @Column(name = "CARRIER_MOBILE")
    public String getCarrierMobile() {
        return carrierMobile;
    }

    public void setCarrierMobile(String carrierMobile) {
        this.carrierMobile = carrierMobile;
    }

    @Basic
    @Column(name = "CARRIER_DUTY")
    public String getCarrierDuty() {
        return carrierDuty;
    }

    public void setCarrierDuty(String carrierDuty) {
        this.carrierDuty = carrierDuty;
    }

    @Basic
    @Column(name = "CARRIER_TELPHONE")
    public String getCarrierTelphone() {
        return carrierTelphone;
    }

    public void setCarrierTelphone(String carrierTelphone) {
        this.carrierTelphone = carrierTelphone;
    }

    @Basic
    @Column(name = "CARRIER_MAIL")
    public String getCarrierMail() {
        return carrierMail;
    }

    public void setCarrierMail(String carrierMail) {
        this.carrierMail = carrierMail;
    }

    @Basic
    @Column(name = "CARRIER_BANK")
    public String getCarrierBank() {
        return carrierBank;
    }

    public void setCarrierBank(String carrierBank) {
        this.carrierBank = carrierBank;
    }

    @Basic
    @Column(name = "CARRIER_BANKNO")
    public String getCarrierBankno() {
        return carrierBankno;
    }

    public void setCarrierBankno(String carrierBankno) {
        this.carrierBankno = carrierBankno;
    }

    @Basic
    @Column(name = "CARRIER_REGID")
    public String getCarrierRegid() {
        return carrierRegid;
    }

    public void setCarrierRegid(String carrierRegid) {
        this.carrierRegid = carrierRegid;
    }

    @Basic
    @Column(name = "CARRIER_REGID_PATH")
    public String getCarrierRegidPath() {
        return carrierRegidPath;
    }

    public void setCarrierRegidPath(String carrierRegidPath) {
        this.carrierRegidPath = carrierRegidPath;
    }

    @Basic
    @Column(name = "CARRIER_TAX")
    public String getCarrierTax() {
        return carrierTax;
    }

    public void setCarrierTax(String carrierTax) {
        this.carrierTax = carrierTax;
    }

    @Basic
    @Column(name = "CARRIER_TAX_PATH")
    public String getCarrierTaxPath() {
        return carrierTaxPath;
    }

    public void setCarrierTaxPath(String carrierTaxPath) {
        this.carrierTaxPath = carrierTaxPath;
    }

    @Basic
    @Column(name = "CARRIER_LICENCE")
    public String getCarrierLicence() {
        return carrierLicence;
    }

    public void setCarrierLicence(String carrierLicence) {
        this.carrierLicence = carrierLicence;
    }

    @Basic
    @Column(name = "CARRIER_LICENCE_PATH")
    public String getCarrierLicencePath() {
        return carrierLicencePath;
    }

    public void setCarrierLicencePath(String carrierLicencePath) {
        this.carrierLicencePath = carrierLicencePath;
    }

    @Basic
    @Column(name = "CARRIER_LEGAL_PERSON")
    public String getCarrierLegalPerson() {
        return carrierLegalPerson;
    }

    public void setCarrierLegalPerson(String carrierLegalPerson) {
        this.carrierLegalPerson = carrierLegalPerson;
    }

    @Basic
    @Column(name = "CARRIER_URL")
    public String getCarrierUrl() {
        return carrierUrl;
    }

    public void setCarrierUrl(String carrierUrl) {
        this.carrierUrl = carrierUrl;
    }

    @Basic
    @Column(name = "CARRIER_LOGO")
    public String getCarrierLogo() {
        return carrierLogo;
    }

    public void setCarrierLogo(String carrierLogo) {
        this.carrierLogo = carrierLogo;
    }

    @Basic
    @Column(name = "CARRIER_TEXT")
    public String getCarrierText() {
        return carrierText;
    }

    public void setCarrierText(String carrierText) {
        this.carrierText = carrierText;
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
    @Column(name = "ADD_NAME")
    public String getAddName() {
        return addName;
    }

    public void setAddName(String addName) {
        this.addName = addName;
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
    @Column(name = "U_TIME")
    public Timestamp getuTime() {
        return uTime;
    }

    public void setuTime(Timestamp uTime) {
        this.uTime = uTime;
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
    @Column(name = "UPD_DATE")
    public Timestamp getUpdDate() {
        return updDate;
    }

    public void setUpdDate(Timestamp updDate) {
        this.updDate = updDate;
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
    @Column(name = "CARRIER_STATE")
    public Integer getCarrierState() {
        return carrierState;
    }

    public void setCarrierState(Integer carrierState) {
        this.carrierState = carrierState;
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
    @Column(name = "CARRIER_PASSW")
    public String getCarrierPassw() {
        return carrierPassw;
    }

    public void setCarrierPassw(String carrierPassw) {
        this.carrierPassw = carrierPassw;
    }

    @Basic
    @Column(name = "CARRIER_ROAD_TRANSPORT_PATH")
    public String getCarrierRoadTransportPath() {
        return carrierRoadTransportPath;
    }

    public void setCarrierRoadTransportPath(String carrierRoadTransportPath) {
        this.carrierRoadTransportPath = carrierRoadTransportPath;
    }

    @Basic
    @Column(name = "CARRIER_LOGIN_NAME")
    public String getCarrierLoginName() {
        return carrierLoginName;
    }

    public void setCarrierLoginName(String carrierLoginName) {
        this.carrierLoginName = carrierLoginName;
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
    @Column(name = "DSP_CODE")
    public String getDspCode() {
        return dspCode;
    }

    public void setDspCode(String dspCode) {
        this.dspCode = dspCode;
    }

    @Basic
    @Column(name = "DSP_NAME")
    public String getDspName() {
        return dspName;
    }

    public void setDspName(String dspName) {
        this.dspName = dspName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BasicCarrierEntity that = (BasicCarrierEntity) o;
        return Objects.equals(carrierId, that.carrierId) &&
                Objects.equals(carrierName, that.carrierName) &&
                Objects.equals(carrierShortName, that.carrierShortName) &&
                Objects.equals(carrierEnName, that.carrierEnName) &&
                Objects.equals(carrierPy, that.carrierPy) &&
                Objects.equals(carrierDesc, that.carrierDesc) &&
                Objects.equals(carrierAddress, that.carrierAddress) &&
                Objects.equals(carrierContactman, that.carrierContactman) &&
                Objects.equals(carrierMobile, that.carrierMobile) &&
                Objects.equals(carrierDuty, that.carrierDuty) &&
                Objects.equals(carrierTelphone, that.carrierTelphone) &&
                Objects.equals(carrierMail, that.carrierMail) &&
                Objects.equals(carrierBank, that.carrierBank) &&
                Objects.equals(carrierBankno, that.carrierBankno) &&
                Objects.equals(carrierRegid, that.carrierRegid) &&
                Objects.equals(carrierRegidPath, that.carrierRegidPath) &&
                Objects.equals(carrierTax, that.carrierTax) &&
                Objects.equals(carrierTaxPath, that.carrierTaxPath) &&
                Objects.equals(carrierLicence, that.carrierLicence) &&
                Objects.equals(carrierLicencePath, that.carrierLicencePath) &&
                Objects.equals(carrierLegalPerson, that.carrierLegalPerson) &&
                Objects.equals(carrierUrl, that.carrierUrl) &&
                Objects.equals(carrierLogo, that.carrierLogo) &&
                Objects.equals(carrierText, that.carrierText) &&
                Objects.equals(addUserid, that.addUserid) &&
                Objects.equals(addName, that.addName) &&
                Objects.equals(addDate, that.addDate) &&
                Objects.equals(uTime, that.uTime) &&
                Objects.equals(uDelete, that.uDelete) &&
                Objects.equals(updDate, that.updDate) &&
                Objects.equals(updName, that.updName) &&
                Objects.equals(carrierState, that.carrierState) &&
                Objects.equals(comId, that.comId) &&
                Objects.equals(carrierPassw, that.carrierPassw) &&
                Objects.equals(carrierRoadTransportPath, that.carrierRoadTransportPath) &&
                Objects.equals(carrierLoginName, that.carrierLoginName) &&
                Objects.equals(deptId, that.deptId) &&
                Objects.equals(dspCode, that.dspCode) &&
                Objects.equals(dspName, that.dspName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carrierId, carrierName, carrierShortName, carrierEnName, carrierPy, carrierDesc, carrierAddress, carrierContactman, carrierMobile, carrierDuty, carrierTelphone, carrierMail, carrierBank, carrierBankno, carrierRegid, carrierRegidPath, carrierTax, carrierTaxPath, carrierLicence, carrierLicencePath, carrierLegalPerson, carrierUrl, carrierLogo, carrierText, addUserid, addName, addDate, uTime, uDelete, updDate, updName, carrierState, comId, carrierPassw, carrierRoadTransportPath, carrierLoginName, deptId, dspCode, dspName);
    }
}
