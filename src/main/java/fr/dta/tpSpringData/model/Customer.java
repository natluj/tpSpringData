package fr.dta.tpSpringData.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
	private Long id;
	
	@Column
	String firstname;
	@Column	
	String lastname;
	@Column
	String title;
	@Column
	String email;
	@Column
	String address;
	@Column 
	String country;
	
	public Customer() {	}
	
	public Customer(String firstname, String lastname, String title, String email, String address, String country) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.title = title;
		this.email = email;
		this.address = address;
		this.country = country;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	
	
}
