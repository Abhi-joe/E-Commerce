package com.ecomm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pincode")
public class PincodeEntity {

	@Id
	private int pincodeId;
	private String country;
	private String state;
	private String district;
	private String city;
	@Column(name = "active")
	private String active;

	public PincodeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PincodeEntity(int pincodeId, String country, String state, String district, String city, String active) {
		super();
		this.pincodeId = pincodeId;
		this.country = country;
		this.state = state;
		this.district = district;
		this.city = city;
		this.active = active;
	}

	public int getPincodeId() {
		return pincodeId;
	}

	public void setPincodeId(int pincodeId) {
		this.pincodeId = pincodeId;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "PincodeEntity [pincodeId=" + pincodeId + ", country=" + country + ", state=" + state + ", district="
				+ district + ", city=" + city + ", active=" + active + "]";
	}

}
