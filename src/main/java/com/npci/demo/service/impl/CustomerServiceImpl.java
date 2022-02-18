package com.npci.demo.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.npci.demo.dao.CustomerDao;
import com.npci.demo.entity.Customers;
import com.npci.demo.repository.CustomerRepository;
import com.npci.demo.response.TransactionResponse;
import com.npci.demo.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired CustomerDao customerDao;
	@Autowired CustomerRepository customerRepository;
	@Override
	public List<Customers> getAllCustomers() {
		// TODO Auto-generated method stub
		return (List<Customers>) customerRepository.findAll();
	}
	
	@Override
	public Customers getById(int c_id) {
		// TODO Auto-generated method stub
		return customerRepository.findById(c_id).orElse(null);
	}

	@Override
	public List<Customers> getbyLoc(String address) {
		// TODO Auto-generated method stub
		return (List<Customers>) customerRepository.getbyLoc(address);
	}

	@Override
	public Customers addCustomer(Customers customers) {
		// TODO Auto-generated method stub
		return customerRepository.save(customers);
	}

	@Override
	public String deleteCustomer(int c_id) {
		// TODO Auto-generated method stub
		Customers customer = null;
		String message = null;
		try {
			customer = customerRepository.findById(c_id).orElse(null);
			if(customer == null) {
				message = "Customer not available";
			}
			else {
				customerRepository.deleteById(c_id);
				message = "Deleted successfully..!";
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
		
		return message;
	}

	@Override
	public List<TransactionResponse> getTransDetails() {
		// TODO Auto-generated method stub
		return (List<TransactionResponse>) customerDao.getTransDetail() ;
	}

}
