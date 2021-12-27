package com.bridgelabz.addressbookapp.dto;


import javax.validation.constraints.Pattern;

public class ContactDTO {

	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\$]{2,}$",message = "Firstname is Invalid")
	public String firstName;
	

	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\$]{3,}$",message = "Lastname is Invalid")
	public String lastName;
	
	public String address;
	public String state;
	public String city;
	public String zip;
	public String phone;

	public ContactDTO(String firstName, String lastName, String address, String state, String city, String zip,
			String phone) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.state = state;
		this.city = city;
		this.zip = zip;
		this.phone = phone;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return  "firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + "state="+ state + ", city="
				+ city + "zip="+ zip + ", phoneNum=" + phone  ;
	}

}