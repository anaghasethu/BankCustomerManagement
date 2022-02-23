package com.npci.demo.response;

import lombok.Data;

@Data
public class TransactionResponse {

	private int trans_id;
	private String name;
	private float amount;

	public TransactionResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TransactionResponse(int trans_id, String name, float amount) {
		super();
		this.trans_id = trans_id;
		this.name = name;
		this.amount = amount;
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

	@Override
	public String toString() {
		return "TransactionResponse [trans_id=" + trans_id + ", name=" + name + ", amount=" + amount + "]";
	}

}
