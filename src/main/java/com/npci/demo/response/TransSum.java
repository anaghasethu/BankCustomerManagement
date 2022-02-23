package com.npci.demo.response;

import java.sql.Date;

import lombok.Data;

@Data
public class TransSum {

	private int trans_id;
	private String name;
	private float amount;
	private Date trans_date;

	public TransSum() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TransSum(int trans_id, String name, float amount, Date trans_date) {
		super();
		this.trans_id = trans_id;
		this.name = name;
		this.amount = amount;
		this.trans_date = trans_date;
	}

	public int getTrans_id() {
		return trans_id;
	}

	public void setTrans_id(int trans_id) {
		this.trans_id = trans_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public Date getTrans_date() {
		return trans_date;
	}

	public void setTrans_date(Date trans_date) {
		this.trans_date = trans_date;
	}

	@Override
	public String toString() {
		return "TransSum [trans_id=" + trans_id + ", name=" + name + ", amount=" + amount + ", trans_date=" + trans_date
				+ "]";
	}

}
