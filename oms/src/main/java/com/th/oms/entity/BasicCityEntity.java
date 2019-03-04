package com.th.oms.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "basic_city", schema = "thoms", catalog = "")
public class BasicCityEntity {
    private String cityId;
    private String province;
    private String city;
    private Integer uDelete;
    private String comId;

    @Id
    @Column(name = "CITY_ID")
    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
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
    @Column(name = "U_DELETE")
    public Integer getuDelete() {
        return uDelete;
    }

    public void setuDelete(Integer uDelete) {
        this.uDelete = uDelete;
    }

    @Basic
    @Column(name = "COM_ID")
    public String getComId() {
        return comId;
    }

    public void setComId(String comId) {
        this.comId = comId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BasicCityEntity that = (BasicCityEntity) o;
        return Objects.equals(cityId, that.cityId) &&
                Objects.equals(province, that.province) &&
                Objects.equals(city, that.city) &&
                Objects.equals(uDelete, that.uDelete) &&
                Objects.equals(comId, that.comId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cityId, province, city, uDelete, comId);
    }
}
