package com.th.oms.entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "basic_driver", schema = "thoms", catalog = "")
public class BasicDriverEntity {
    private String driverId;
    private String originalId;
    private String carrierId;
    private String driverName;
    private Integer driverGender;
    private String driverSfz;
    private Date driverBirthday;
    private Integer driverMariiage;
    private String driverAddress;
    private String driverMobile;
    private String driverMobileSec;
    private String urgentMan;
    private String urgentMobile;
    private String driverMobileThr;
    private String city01;
    private String city02;
    private String sfzFace;
    private String sfzBack;
    private String driverJsz;
    private String driverXsz;
    private String driverBxk;
    private String driverYyz;
    private String wxNumber;
    private String driverZgz;
    private String driverJqx;
    private String cardProvince;
    private String cardCity;
    private String cardBank;
    private String bankNo;
    private String cardName;
    private Double driverCredit;
    private String driverText;
    private Integer driverState;
    private String addName;
    private Timestamp addDate;
    private String updName;
    private String comId;
    private String comPf;
    private String addUserid;
    private Timestamp uTime;
    private Integer uDelete;
    private Timestamp updDate;
    private Integer driverNum;
    private Timestamp driverFirst;
    private String carrierName;
    private String driverPassword;
    private String driverSource;
    private String driverJszNo;
    private String driverCheck;
    private String driverXszCopy;

    @Id
    @Column(name = "DRIVER_ID")
    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    @Basic
    @Column(name = "ORIGINAL_ID")
    public String getOriginalId() {
        return originalId;
    }

    public void setOriginalId(String originalId) {
        this.originalId = originalId;
    }

    @Basic
    @Column(name = "CARRIER_ID")
    public String getCarrierId() {
        return carrierId;
    }

    public void setCarrierId(String carrierId) {
        this.carrierId = carrierId;
    }

    @Basic
    @Column(name = "DRIVER_NAME")
    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    @Basic
    @Column(name = "DRIVER_GENDER")
    public Integer getDriverGender() {
        return driverGender;
    }

    public void setDriverGender(Integer driverGender) {
        this.driverGender = driverGender;
    }

    @Basic
    @Column(name = "DRIVER_SFZ")
    public String getDriverSfz() {
        return driverSfz;
    }

    public void setDriverSfz(String driverSfz) {
        this.driverSfz = driverSfz;
    }

    @Basic
    @Column(name = "DRIVER_BIRTHDAY")
    public Date getDriverBirthday() {
        return driverBirthday;
    }

    public void setDriverBirthday(Date driverBirthday) {
        this.driverBirthday = driverBirthday;
    }

    @Basic
    @Column(name = "DRIVER_MARIIAGE")
    public Integer getDriverMariiage() {
        return driverMariiage;
    }

    public void setDriverMariiage(Integer driverMariiage) {
        this.driverMariiage = driverMariiage;
    }

    @Basic
    @Column(name = "DRIVER_ADDRESS")
    public String getDriverAddress() {
        return driverAddress;
    }

    public void setDriverAddress(String driverAddress) {
        this.driverAddress = driverAddress;
    }

    @Basic
    @Column(name = "DRIVER_MOBILE")
    public String getDriverMobile() {
        return driverMobile;
    }

    public void setDriverMobile(String driverMobile) {
        this.driverMobile = driverMobile;
    }

    @Basic
    @Column(name = "DRIVER_MOBILE_SEC")
    public String getDriverMobileSec() {
        return driverMobileSec;
    }

    public void setDriverMobileSec(String driverMobileSec) {
        this.driverMobileSec = driverMobileSec;
    }

    @Basic
    @Column(name = "URGENT_MAN")
    public String getUrgentMan() {
        return urgentMan;
    }

    public void setUrgentMan(String urgentMan) {
        this.urgentMan = urgentMan;
    }

    @Basic
    @Column(name = "URGENT_MOBILE")
    public String getUrgentMobile() {
        return urgentMobile;
    }

    public void setUrgentMobile(String urgentMobile) {
        this.urgentMobile = urgentMobile;
    }

    @Basic
    @Column(name = "DRIVER_MOBILE_THR")
    public String getDriverMobileThr() {
        return driverMobileThr;
    }

    public void setDriverMobileThr(String driverMobileThr) {
        this.driverMobileThr = driverMobileThr;
    }

    @Basic
    @Column(name = "CITY_01")
    public String getCity01() {
        return city01;
    }

    public void setCity01(String city01) {
        this.city01 = city01;
    }

    @Basic
    @Column(name = "CITY_02")
    public String getCity02() {
        return city02;
    }

    public void setCity02(String city02) {
        this.city02 = city02;
    }

    @Basic
    @Column(name = "SFZ_FACE")
    public String getSfzFace() {
        return sfzFace;
    }

    public void setSfzFace(String sfzFace) {
        this.sfzFace = sfzFace;
    }

    @Basic
    @Column(name = "SFZ_BACK")
    public String getSfzBack() {
        return sfzBack;
    }

    public void setSfzBack(String sfzBack) {
        this.sfzBack = sfzBack;
    }

    @Basic
    @Column(name = "DRIVER_JSZ")
    public String getDriverJsz() {
        return driverJsz;
    }

    public void setDriverJsz(String driverJsz) {
        this.driverJsz = driverJsz;
    }

    @Basic
    @Column(name = "DRIVER_XSZ")
    public String getDriverXsz() {
        return driverXsz;
    }

    public void setDriverXsz(String driverXsz) {
        this.driverXsz = driverXsz;
    }

    @Basic
    @Column(name = "DRIVER_BXK")
    public String getDriverBxk() {
        return driverBxk;
    }

    public void setDriverBxk(String driverBxk) {
        this.driverBxk = driverBxk;
    }

    @Basic
    @Column(name = "DRIVER_YYZ")
    public String getDriverYyz() {
        return driverYyz;
    }

    public void setDriverYyz(String driverYyz) {
        this.driverYyz = driverYyz;
    }

    @Basic
    @Column(name = "WX_NUMBER")
    public String getWxNumber() {
        return wxNumber;
    }

    public void setWxNumber(String wxNumber) {
        this.wxNumber = wxNumber;
    }

    @Basic
    @Column(name = "DRIVER_ZGZ")
    public String getDriverZgz() {
        return driverZgz;
    }

    public void setDriverZgz(String driverZgz) {
        this.driverZgz = driverZgz;
    }

    @Basic
    @Column(name = "DRIVER_JQX")
    public String getDriverJqx() {
        return driverJqx;
    }

    public void setDriverJqx(String driverJqx) {
        this.driverJqx = driverJqx;
    }

    @Basic
    @Column(name = "CARD_PROVINCE")
    public String getCardProvince() {
        return cardProvince;
    }

    public void setCardProvince(String cardProvince) {
        this.cardProvince = cardProvince;
    }

    @Basic
    @Column(name = "CARD_CITY")
    public String getCardCity() {
        return cardCity;
    }

    public void setCardCity(String cardCity) {
        this.cardCity = cardCity;
    }

    @Basic
    @Column(name = "CARD_BANK")
    public String getCardBank() {
        return cardBank;
    }

    public void setCardBank(String cardBank) {
        this.cardBank = cardBank;
    }

    @Basic
    @Column(name = "BANK_NO")
    public String getBankNo() {
        return bankNo;
    }

    public void setBankNo(String bankNo) {
        this.bankNo = bankNo;
    }

    @Basic
    @Column(name = "CARD_NAME")
    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    @Basic
    @Column(name = "DRIVER_CREDIT")
    public Double getDriverCredit() {
        return driverCredit;
    }

    public void setDriverCredit(Double driverCredit) {
        this.driverCredit = driverCredit;
    }

    @Basic
    @Column(name = "DRIVER_TEXT")
    public String getDriverText() {
        return driverText;
    }

    public void setDriverText(String driverText) {
        this.driverText = driverText;
    }

    @Basic
    @Column(name = "DRIVER_STATE")
    public Integer getDriverState() {
        return driverState;
    }

    public void setDriverState(Integer driverState) {
        this.driverState = driverState;
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
    @Column(name = "UPD_NAME")
    public String getUpdName() {
        return updName;
    }

    public void setUpdName(String updName) {
        this.updName = updName;
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
    @Column(name = "COM_PF")
    public String getComPf() {
        return comPf;
    }

    public void setComPf(String comPf) {
        this.comPf = comPf;
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
    @Column(name = "DRIVER_NUM")
    public Integer getDriverNum() {
        return driverNum;
    }

    public void setDriverNum(Integer driverNum) {
        this.driverNum = driverNum;
    }

    @Basic
    @Column(name = "DRIVER_FIRST")
    public Timestamp getDriverFirst() {
        return driverFirst;
    }

    public void setDriverFirst(Timestamp driverFirst) {
        this.driverFirst = driverFirst;
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
    @Column(name = "DRIVER_PASSWORD")
    public String getDriverPassword() {
        return driverPassword;
    }

    public void setDriverPassword(String driverPassword) {
        this.driverPassword = driverPassword;
    }

    @Basic
    @Column(name = "DRIVER_SOURCE")
    public String getDriverSource() {
        return driverSource;
    }

    public void setDriverSource(String driverSource) {
        this.driverSource = driverSource;
    }

    @Basic
    @Column(name = "DRIVER_JSZ_NO")
    public String getDriverJszNo() {
        return driverJszNo;
    }

    public void setDriverJszNo(String driverJszNo) {
        this.driverJszNo = driverJszNo;
    }

    @Basic
    @Column(name = "DRIVER_CHECK")
    public String getDriverCheck() {
        return driverCheck;
    }

    public void setDriverCheck(String driverCheck) {
        this.driverCheck = driverCheck;
    }

    @Basic
    @Column(name = "DRIVER_XSZ_COPY")
    public String getDriverXszCopy() {
        return driverXszCopy;
    }

    public void setDriverXszCopy(String driverXszCopy) {
        this.driverXszCopy = driverXszCopy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BasicDriverEntity that = (BasicDriverEntity) o;
        return Objects.equals(driverId, that.driverId) &&
                Objects.equals(originalId, that.originalId) &&
                Objects.equals(carrierId, that.carrierId) &&
                Objects.equals(driverName, that.driverName) &&
                Objects.equals(driverGender, that.driverGender) &&
                Objects.equals(driverSfz, that.driverSfz) &&
                Objects.equals(driverBirthday, that.driverBirthday) &&
                Objects.equals(driverMariiage, that.driverMariiage) &&
                Objects.equals(driverAddress, that.driverAddress) &&
                Objects.equals(driverMobile, that.driverMobile) &&
                Objects.equals(driverMobileSec, that.driverMobileSec) &&
                Objects.equals(urgentMan, that.urgentMan) &&
                Objects.equals(urgentMobile, that.urgentMobile) &&
                Objects.equals(driverMobileThr, that.driverMobileThr) &&
                Objects.equals(city01, that.city01) &&
                Objects.equals(city02, that.city02) &&
                Objects.equals(sfzFace, that.sfzFace) &&
                Objects.equals(sfzBack, that.sfzBack) &&
                Objects.equals(driverJsz, that.driverJsz) &&
                Objects.equals(driverXsz, that.driverXsz) &&
                Objects.equals(driverBxk, that.driverBxk) &&
                Objects.equals(driverYyz, that.driverYyz) &&
                Objects.equals(wxNumber, that.wxNumber) &&
                Objects.equals(driverZgz, that.driverZgz) &&
                Objects.equals(driverJqx, that.driverJqx) &&
                Objects.equals(cardProvince, that.cardProvince) &&
                Objects.equals(cardCity, that.cardCity) &&
                Objects.equals(cardBank, that.cardBank) &&
                Objects.equals(bankNo, that.bankNo) &&
                Objects.equals(cardName, that.cardName) &&
                Objects.equals(driverCredit, that.driverCredit) &&
                Objects.equals(driverText, that.driverText) &&
                Objects.equals(driverState, that.driverState) &&
                Objects.equals(addName, that.addName) &&
                Objects.equals(addDate, that.addDate) &&
                Objects.equals(updName, that.updName) &&
                Objects.equals(comId, that.comId) &&
                Objects.equals(comPf, that.comPf) &&
                Objects.equals(addUserid, that.addUserid) &&
                Objects.equals(uTime, that.uTime) &&
                Objects.equals(uDelete, that.uDelete) &&
                Objects.equals(updDate, that.updDate) &&
                Objects.equals(driverNum, that.driverNum) &&
                Objects.equals(driverFirst, that.driverFirst) &&
                Objects.equals(carrierName, that.carrierName) &&
                Objects.equals(driverPassword, that.driverPassword) &&
                Objects.equals(driverSource, that.driverSource) &&
                Objects.equals(driverJszNo, that.driverJszNo) &&
                Objects.equals(driverCheck, that.driverCheck) &&
                Objects.equals(driverXszCopy, that.driverXszCopy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(driverId, originalId, carrierId, driverName, driverGender, driverSfz, driverBirthday, driverMariiage, driverAddress, driverMobile, driverMobileSec, urgentMan, urgentMobile, driverMobileThr, city01, city02, sfzFace, sfzBack, driverJsz, driverXsz, driverBxk, driverYyz, wxNumber, driverZgz, driverJqx, cardProvince, cardCity, cardBank, bankNo, cardName, driverCredit, driverText, driverState, addName, addDate, updName, comId, comPf, addUserid, uTime, uDelete, updDate, driverNum, driverFirst, carrierName, driverPassword, driverSource, driverJszNo, driverCheck, driverXszCopy);
    }
}
