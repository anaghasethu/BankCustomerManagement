package com.npci.demo.dao;

import java.util.List;

import com.npci.demo.response.TransDetails;
import com.npci.demo.response.TransSum;
import com.npci.demo.response.TransactionResponse;

public interface CustomerDao {

	public List<TransactionResponse> getTransDetail();

	public List<TransSum> getTransactionSum();

	public List<TransDetails> getTransBal();

	public List<TransDetails> getTop();
}
