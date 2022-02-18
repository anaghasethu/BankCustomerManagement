package com.npci.demo.dao;


import java.util.List;
import com.npci.demo.response.TransactionResponse;



public interface CustomerDao {
	
	public List<TransactionResponse> getTransDetail();

}
