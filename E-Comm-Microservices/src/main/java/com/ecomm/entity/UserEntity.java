package com.ecomm.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 
 * USER entity for mapping with the user table in database.
 * 
 * @author Abhi
 *
 */
@Entity
@Table(name = "user")
public class UserEntity {

	/**
	 * Instance variables of USER entity.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String userName;
	@Column(name = "pwd")
	private String password;
	private String email;
	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;
	private String sex;
	private int phoneNumber;
	private String displayPicture;
	@Column(name = "active")
	private String isActive;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "addressid")
	private AddressEntity address;
	/*@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "orderid")
	private OrderEntity order;*/

	/**
	 * default constructor of USER entity.
	 */
	public UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Parameterized constructor for USER entity.
	 * 
	 * @param userId
	 * @param firstName
	 * @param middleName
	 * @param lastName
	 * @param userName
	 * @param password
	 * @param email
	 * @param dateOfBirth
	 * @param sex
	 * @param phoneNumber
	 * @param isActive
	 * @param address
	 * @param order
	 */

	public UserEntity(int userId, String firstName, String middleName, String lastName, String userName,
			String password, String email, Date dateOfBirth, String sex, int phoneNumber, String isActive,
			AddressEntity address, /*OrderEntity order,*/ String displayPicture) {
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
		this.address = address;
		//this.order = order;
		this.displayPicture = displayPicture;
	}

	/**
	 * Getters and setters for USER entity.
	 * 
	 * @return
	 */
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

	public AddressEntity getAddress() {
		return address;
	}

	public void setAddress(AddressEntity address) {
		this.address = address;
	}

/*	public OrderEntity getOrder() {
		return order;
	}

	public void setOrder(OrderEntity order) {
		this.order = order;
	}*/

	public String getDisplayPicture() {
		return displayPicture;
	}

	public void setDisplayPicture(String displayPicture) {
		this.displayPicture = displayPicture;
	}

	@Override
	public String toString() {
		return "UserEntity [userId=" + userId + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", userName=" + userName + ", password=" + password + ", email=" + email
				+ ", dateOfBirth=" + dateOfBirth + ", sex=" + sex + ",displayPicture="+displayPicture+" phoneNumber=" + phoneNumber + ", isActive="
				+ isActive + ", address=" + address +/* ", order=" + order +*/ "]";
	}

}
