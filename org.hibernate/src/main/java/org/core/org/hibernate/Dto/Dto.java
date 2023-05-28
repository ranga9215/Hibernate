package org.core.org.hibernate.Dto;

import java.io.Serializable;

public class Dto implements Serializable{
	
	private long Altkey;
private String name;
	
	private String email;
	
	private String contactNumber;
	
	private String password;
	
	private String city;
	
	private String country;
	
	private String pinCode;

	public long getAltkey() {
		return Altkey;
	}

	public void setAltkey(long altkey) {
		Altkey = altkey;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

}
