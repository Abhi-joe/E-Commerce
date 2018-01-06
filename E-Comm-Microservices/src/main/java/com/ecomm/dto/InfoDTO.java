package com.ecomm.dto;

import java.util.Date;

public class InfoDTO {
	/**
	 * from USER entity
	 */
	private int userId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String userName;
	private String password;
	private String email;
	private Date dateOfBirth;
	private String sex;
	private String displayPicture;
	private int phoneNumber;
	private String isActive;
	/**
	 * from ADDRESS entity
	 */
	private int addressId;
	private String address1;
	private String address2;
	private String isExists;
	/**
	 * From PINCODE entity
	 */
	private int pincodeId;
	private String country;
	private String state;
	private String district;
	private String city;
	private String active;
	/**
	 * From PRODUCT entity
	 */
	private int productId;
	private String productName;
	private double productPrice;
	private String productType;
	private String productImage;
	private String deleted;
	/**
	 * From ORDER entity
	 */
	private int orderId;
	private Date orderDate;
	private int quantity;
	private double bill;
	private String orderStatus;
	private String stat;

	public InfoDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InfoDTO(int userId, String firstName, String middleName, String lastName, String userName, String password,
			String email, Date dateOfBirth, String sex, int phoneNumber, String displayPicture, String isActive,
			int addressId, String address1, String address2, String isExists, int pincodeId, String country,
			String state, String district, String city, String active, int productId, String productName,
			double productPrice, String productType, String productImage, String deleted, int orderId, Date orderDate,
			int quantity, double bill, String orderStatus, String stat) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.sex = sex;
		this.phoneNumber = phoneNumber;
		this.isActive = isActive;
		this.addressId = addressId;
		this.address1 = address1;
		this.address2 = address2;
		this.isExists = isExists;
		this.pincodeId = pincodeId;
		this.country = country;
		this.state = state;
		this.district = district;
		this.city = city;
		this.active = active;
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productType = productType;
		this.deleted = deleted;
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.quantity = quantity;
		this.bill = bill;
		this.orderStatus = orderStatus;
		this.stat = stat;
		this.displayPicture = displayPicture;
		this.productImage = productImage;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

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

	public String getIsExists() {
		return isExists;
	}

	public void setIsExists(String isExists) {
		this.isExists = isExists;
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

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getDeleted() {
		return deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getBill() {
		return bill;
	}

	public void setBill(double bill) {
		this.bill = bill;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getStat() {
		return stat;
	}

	public void setStat(String stat) {
		this.stat = stat;
	}

	public String getDisplayPicture() {
		return displayPicture;
	}

	public void setDisplayPicture(String displayPicture) {
		this.displayPicture = displayPicture;
	}

	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	@Override
	public String toString() {
		return "InfoDTO [userId=" + userId + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName="
				+ lastName + ", userName=" + userName + ", password=" + password + ", email=" + email + ", dateOfBirth="
				+ dateOfBirth + ", sex=" + sex + ", phoneNumber=" + phoneNumber + ", displayPicture=" + displayPicture
				+ ", isActive=" + isActive + ", addressId=" + addressId + ", address1=" + address1 + ", address2="
				+ address2 + ", isExists=" + isExists + ", pincodeId=" + pincodeId + ", country=" + country + ", state="
				+ state + ", district=" + district + ", city=" + city + ", active=" + active + ", productId="
				+ productId + ", productName=" + productName + ", productPrice=" + productPrice + ", productType="
				+ productType + ",productImage=" + productImage + ", deleted=" + deleted + ", orderId=" + orderId
				+ ", orderDate=" + orderDate + ", quantity=" + quantity + ", bill=" + bill + ", orderStatus="
				+ orderStatus + ", stat=" + stat + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((active == null) ? 0 : active.hashCode());
		result = prime * result + ((address1 == null) ? 0 : address1.hashCode());
		result = prime * result + ((address2 == null) ? 0 : address2.hashCode());
		result = prime * result + addressId;
		long temp;
		temp = Double.doubleToLongBits(bill);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime * result + ((deleted == null) ? 0 : deleted.hashCode());
		result = prime * result + ((displayPicture == null) ? 0 : displayPicture.hashCode());
		result = prime * result + ((district == null) ? 0 : district.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((isActive == null) ? 0 : isActive.hashCode());
		result = prime * result + ((isExists == null) ? 0 : isExists.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((middleName == null) ? 0 : middleName.hashCode());
		result = prime * result + ((orderDate == null) ? 0 : orderDate.hashCode());
		result = prime * result + orderId;
		result = prime * result + ((orderStatus == null) ? 0 : orderStatus.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + phoneNumber;
		result = prime * result + pincodeId;
		result = prime * result + productId;
		result = prime * result + ((productImage == null) ? 0 : productImage.hashCode());
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		temp = Double.doubleToLongBits(productPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((productType == null) ? 0 : productType.hashCode());
		result = prime * result + quantity;
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		result = prime * result + ((stat == null) ? 0 : stat.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + userId;
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InfoDTO other = (InfoDTO) obj;
		if (active == null) {
			if (other.active != null)
				return false;
		} else if (!active.equals(other.active))
			return false;
		if (address1 == null) {
			if (other.address1 != null)
				return false;
		} else if (!address1.equals(other.address1))
			return false;
		if (address2 == null) {
			if (other.address2 != null)
				return false;
		} else if (!address2.equals(other.address2))
			return false;
		if (addressId != other.addressId)
			return false;
		if (Double.doubleToLongBits(bill) != Double.doubleToLongBits(other.bill))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		} else if (!dateOfBirth.equals(other.dateOfBirth))
			return false;
		if (deleted == null) {
			if (other.deleted != null)
				return false;
		} else if (!deleted.equals(other.deleted))
			return false;
		if (displayPicture == null) {
			if (other.displayPicture != null)
				return false;
		} else if (!displayPicture.equals(other.displayPicture))
			return false;
		if (district == null) {
			if (other.district != null)
				return false;
		} else if (!district.equals(other.district))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (isActive == null) {
			if (other.isActive != null)
				return false;
		} else if (!isActive.equals(other.isActive))
			return false;
		if (isExists == null) {
			if (other.isExists != null)
				return false;
		} else if (!isExists.equals(other.isExists))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (middleName == null) {
			if (other.middleName != null)
				return false;
		} else if (!middleName.equals(other.middleName))
			return false;
		if (orderDate == null) {
			if (other.orderDate != null)
				return false;
		} else if (!orderDate.equals(other.orderDate))
			return false;
		if (orderId != other.orderId)
			return false;
		if (orderStatus == null) {
			if (other.orderStatus != null)
				return false;
		} else if (!orderStatus.equals(other.orderStatus))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (phoneNumber != other.phoneNumber)
			return false;
		if (pincodeId != other.pincodeId)
			return false;
		if (productId != other.productId)
			return false;
		if (productImage == null) {
			if (other.productImage != null)
				return false;
		} else if (!productImage.equals(other.productImage))
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (Double.doubleToLongBits(productPrice) != Double.doubleToLongBits(other.productPrice))
			return false;
		if (productType == null) {
			if (other.productType != null)
				return false;
		} else if (!productType.equals(other.productType))
			return false;
		if (quantity != other.quantity)
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		if (stat == null) {
			if (other.stat != null)
				return false;
		} else if (!stat.equals(other.stat))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (userId != other.userId)
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}

}
