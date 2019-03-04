package com.th.wms.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "basic_owner", schema = "thwms", catalog = "")
public class BasicOwnerEntity {
    private String ownerId;
    private String ownerCodeab;
    private String ownerCode;
    private String ownerName;
    private String zip;
    private String contact1;
    private String phone1;
    private String fax1;
    private String email1;
    private int ownerState;
    private String ownerText;
    private String cdhNo;
    private String omsNo;
    private String contact2;
    private String phone2;
    private String fax2;
    private String email2;
    private String comId;
    private String country;
    private String province;
    private String city;
    private String address;
    private String area;
    private String addUserid;
    private Timestamp addTime;
    private String addName;
    private String updUserid;
    private Timestamp updTime;
    private String updName;
    private Integer uDelete;
    private Timestamp uTime;

    @Id
    @Column(name = "OWNER_ID")
    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    @Basic
    @Column(name = "OWNER_CODEAB")
    public String getOwnerCodeab() {
        return ownerCodeab;
    }

    public void setOwnerCodeab(String ownerCodeab) {
        this.ownerCodeab = ownerCodeab;
    }

    @Basic
    @Column(name = "OWNER_CODE")
    public String getOwnerCode() {
        return ownerCode;
    }

    public void setOwnerCode(String ownerCode) {
        this.ownerCode = ownerCode;
    }

    @Basic
    @Column(name = "OWNER_NAME")
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Basic
    @Column(name = "ZIP")
    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Basic
    @Column(name = "CONTACT1")
    public String getContact1() {
        return contact1;
    }

    public void setContact1(String contact1) {
        this.contact1 = contact1;
    }

    @Basic
    @Column(name = "PHONE1")
    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    @Basic
    @Column(name = "FAX1")
    public String getFax1() {
        return fax1;
    }

    public void setFax1(String fax1) {
        this.fax1 = fax1;
    }

    @Basic
    @Column(name = "EMAIL1")
    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    @Basic
    @Column(name = "OWNER_STATE")
    public int getOwnerState() {
        return ownerState;
    }

    public void setOwnerState(int ownerState) {
        this.ownerState = ownerState;
    }

    @Basic
    @Column(name = "OWNER_TEXT")
    public String getOwnerText() {
        return ownerText;
    }

    public void setOwnerText(String ownerText) {
        this.ownerText = ownerText;
    }

    @Basic
    @Column(name = "CDH_NO")
    public String getCdhNo() {
        return cdhNo;
    }

    public void setCdhNo(String cdhNo) {
        this.cdhNo = cdhNo;
    }

    @Basic
    @Column(name = "OMS_NO")
    public String getOmsNo() {
        return omsNo;
    }

    public void setOmsNo(String omsNo) {
        this.omsNo = omsNo;
    }

    @Basic
    @Column(name = "CONTACT2")
    public String getContact2() {
        return contact2;
    }

    public void setContact2(String contact2) {
        this.contact2 = contact2;
    }

    @Basic
    @Column(name = "PHONE2")
    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    @Basic
    @Column(name = "FAX2")
    public String getFax2() {
        return fax2;
    }

    public void setFax2(String fax2) {
        this.fax2 = fax2;
    }

    @Basic
    @Column(name = "EMAIL2")
    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
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
    @Column(name = "COUNTRY")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Basic
    @Column(name = "PROVINCE")
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Basic
    @Column(name = "CITY")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "ADDRESS")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "AREA")
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
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
        BasicOwnerEntity that = (BasicOwnerEntity) o;
        return ownerState == that.ownerState &&
                Objects.equals(ownerId, that.ownerId) &&
                Objects.equals(ownerCodeab, that.ownerCodeab) &&
                Objects.equals(ownerCode, that.ownerCode) &&
                Objects.equals(ownerName, that.ownerName) &&
                Objects.equals(zip, that.zip) &&
                Objects.equals(contact1, that.contact1) &&
                Objects.equals(phone1, that.phone1) &&
                Objects.equals(fax1, that.fax1) &&
                Objects.equals(email1, that.email1) &&
                Objects.equals(ownerText, that.ownerText) &&
                Objects.equals(cdhNo, that.cdhNo) &&
                Objects.equals(omsNo, that.omsNo) &&
                Objects.equals(contact2, that.contact2) &&
                Objects.equals(phone2, that.phone2) &&
                Objects.equals(fax2, that.fax2) &&
                Objects.equals(email2, that.email2) &&
                Objects.equals(comId, that.comId) &&
                Objects.equals(country, that.country) &&
                Objects.equals(province, that.province) &&
                Objects.equals(city, that.city) &&
                Objects.equals(address, that.address) &&
                Objects.equals(area, that.area) &&
                Objects.equals(addUserid, that.addUserid) &&
                Objects.equals(addTime, that.addTime) &&
                Objects.equals(addName, that.addName) &&
                Objects.equals(updUserid, that.updUserid) &&
                Objects.equals(updTime, that.updTime) &&
                Objects.equals(updName, that.updName) &&
                Objects.equals(uDelete, that.uDelete) &&
                Objects.equals(uTime, that.uTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ownerId, ownerCodeab, ownerCode, ownerName, zip, contact1, phone1, fax1, email1, ownerState, ownerText, cdhNo, omsNo, contact2, phone2, fax2, email2, comId, country, province, city, address, area, addUserid, addTime, addName, updUserid, updTime, updName, uDelete, uTime);
    }
}
