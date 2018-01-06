package com.ecomm.dto;

/**
 * LoginDTO for login of USER.
 * 
 * @author Abhi
 *
 */

public class LoginDTO {

	/**
	 * Instance variables.
	 */
	private String userName;
	private String password;

	/**
	 * default constructor.
	 */
	public LoginDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Parameterized conctructor.
	 * 
	 * @param userName
	 * @param password
	 */
	public LoginDTO(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	/**
	 * Getters and setters.
	 * 
	 * @return
	 */
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

	@Override
	public String toString() {
		return "LoginDTO [userName=" + userName + ", password=" + password + "]";
	}

	/**
	 * Overriding hashcode and equals method for making two objects virtually
	 * equal.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
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
		LoginDTO other = (LoginDTO) obj;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}

}
