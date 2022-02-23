package com.npci.demo.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transaction")
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int trans_id;

	private int c_id;

	private Date trans_date;

	private float trans_amount;

	private int from_c_id;

	private int to_c_id;

	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Transaction(int trans_id, int c_id, Date trans_date, float trans_amount, int from_c_id, int to_c_id) {
		super();
		this.trans_id = trans_id;
		this.c_id = c_id;
		this.trans_date = trans_date;
		this.trans_amount = trans_amount;
		this.from_c_id = from_c_id;
		this.to_c_id = to_c_id;
	}

	public int getTrans_id() {
		return trans_id;
	}

	public void setTrans_id(int trans_id) {
		this.trans_id = trans_id;
	}

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public Date getTrans_date() {
		return trans_date;
	}

	public void setTrans_date(Date trans_date) {
		this.trans_date = trans_date;
	}

	public float getTrans_amount() {
		return trans_amount;
	}

	public void setTrans_amount(float trans_amount) {
		this.trans_amount = trans_amount;
	}

	public int getFrom_c_id() {
		return from_c_id;
	}

	public void setFrom_c_id(int from_c_id) {
		this.from_c_id = from_c_id;
	}

	public int getTo_c_id() {
		return to_c_id;
	}

	public void setTo_c_id(int to_c_id) {
		this.to_c_id = to_c_id;
	}

	@Override
	public String toString() {
		return "Transaction [trans_id=" + trans_id + ", c_id=" + c_id + ", trans_date=" + trans_date + ", trans_amount="
				+ trans_amount + ", from_c_id=" + from_c_id + ", to_c_id=" + to_c_id + "]";
	}

}
