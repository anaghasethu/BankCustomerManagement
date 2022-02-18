package com.npci.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.npci.demo.entity.Customers;
import com.npci.demo.response.TransactionResponse;

@Service
public interface CustomerService{

	public List<Customers> getAllCustomers();

	public Customers getById(int c_id);

	public List<Customers> getbyLoc(String address);

	public Customers addCustomer(Customers customers);

	public String deleteCustomer(int c_id);

	public List<TransactionResponse> getTransDetails();
}
