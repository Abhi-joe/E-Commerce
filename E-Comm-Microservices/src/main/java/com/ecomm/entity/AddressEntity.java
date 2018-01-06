package com.ecomm.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ADDRESS entity for mapping with database.
 * 
 * @author Abhi
 *
 */
@Entity
@Table(name = "Address")
public class AddressEntity {

	/**
	 * Instance variables of ADDRESS entity.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int addressId;
	private String address1;
	private String address2;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "pincodeId")
	private PincodeEntity pincode;
	@Column(name = "active")
	private String isExists;

	/**
	 * Default constructor of ADDRESS entity.
	 */
	public AddressEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Parameterized constructor for ADDRESS entity.
	 * 
	 * @param addressId
	 * @param address1
	 * @param address2
	 * @param pincode
	 * @param isExists
	 */
	public AddressEntity(int addressId, String address1, String address2, PincodeEntity pincode, String isExists) {
		super();
		this.addressId = addressId;
		this.address1 = address1;
		this.address2 = address2;
		this.pincode = pincode;
		this.isExists = isExists;
	}

	/**
	 * Getters and setters for ADDRESS entity.
	 * 
	 * @return
	 */
	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public PincodeEntity getPincode() {
		return pincode;
	}

	public void setPincode(PincodeEntity pincode) {
		this.pincode = pincode;
	}

	public String getIsExists() {
		return isExists;
	}

	public void setIsExists(String isExists) {
		this.isExists = isExists;
	}

	@Override
	public String toString() {
		return "AddressEntity [addressId=" + addressId + ", address1=" + address1 + ", address2=" + address2
				+ ", pincode=" + pincode + ", isExists=" + isExists + "]";
	}

}
