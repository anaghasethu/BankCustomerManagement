package com.npci.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer_details")
public class CustomerDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c_id")
	private int customer_id;

	private String npci_account;

	private String name;

	private String email;

	private String phone;

	private int age;

	private String address;

	private float balance;

	public CustomerDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerDetails(int customer_id, String npci_account, String name, String email, String phone, int age,
			String address, float balance) {
		super();
		this.customer_id = customer_id;
		this.npci_account = npci_account;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.age = age;
		this.address = address;
		this.balance = balance;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getNpci_account() {
		return npci_account;
	}

	public void setNpci_account(String npci_account) {
		this.npci_account = npci_account;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "CustomerDetails [customer_id=" + customer_id + ", npci_account=" + npci_account + ", name=" + name
				+ ", email=" + email + ", phone=" + phone + ", age=" + age + ", address=" + address + ", balance="
				+ balance + "]";
	}

}
