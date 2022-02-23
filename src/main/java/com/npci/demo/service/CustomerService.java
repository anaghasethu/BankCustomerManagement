package com.npci.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.npci.demo.entity.CustomerDetails;
import com.npci.demo.entity.Customers;
import com.npci.demo.response.TransDetails;
import com.npci.demo.response.TransSum;
import com.npci.demo.response.TransactionResponse;

@Service
public interface CustomerService {

	public List<Customers> getAllCustomers();

	public Customers getById(int c_id) throws Exception;

	public List<Customers> getbyLoc(String address);

	public Customers addCustomer(Customers customers);

	public String deleteCustomer(int c_id);

	public List<TransactionResponse> getTransDetails();

	public List<TransSum> getTransSum();

	public List<CustomerDetails> getAllCustomersBal();

	public List<TransDetails> getTransBal();

	public List<TransDetails> getTop();

}
