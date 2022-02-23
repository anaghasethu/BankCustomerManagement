package com.npci.demo.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.npci.demo.dao.CustomerDao;
import com.npci.demo.entity.CustomerDetails;
import com.npci.demo.entity.Customers;
import com.npci.demo.exceptions.ResourceNotFoundException;
import com.npci.demo.repository.CustomerDetailsRepo;
import com.npci.demo.repository.CustomerRepository;
import com.npci.demo.repository.TransactionRepo;
import com.npci.demo.response.TransDetails;
import com.npci.demo.response.TransSum;
import com.npci.demo.response.TransactionResponse;
import com.npci.demo.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDao customerDao;
	@Autowired
	CustomerRepository customerRepository;
	@Autowired
	CustomerDetailsRepo customerDetailsRepo;
	@Autowired
	TransactionRepo transactionRepo;

	@Override
	public List<Customers> getAllCustomers() {
		// TODO Auto-generated method stub
		return (List<Customers>) customerRepository.findAll();
	}

	@Override
	public Customers getById(int c_id) throws Exception {
		// TODO Auto-generated method stub
		return customerRepository.findById(c_id).orElseThrow(() -> new ResourceNotFoundException("User not found"));

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
			if (customer == null) {
				message = "Customer not available";
			} else {
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
		return (List<TransactionResponse>) customerDao.getTransDetail();
	}

	@Override
	public List<TransSum> getTransSum() {
		// TODO Auto-generated method stub
		return (List<TransSum>) customerDao.getTransactionSum();
	}

	@Override
	public List<CustomerDetails> getAllCustomersBal() {
		// TODO Auto-generated method stub
		return (List<CustomerDetails>) customerDetailsRepo.findAll();
	}

	@Override
	public List<TransDetails> getTransBal() {
		// TODO Auto-generated method stub
		return customerDao.getTransBal();
	}

	@Override
	public List<TransDetails> getTop() {
		// TODO Auto-generated method stub
		return customerDao.getTop();
	}

}
