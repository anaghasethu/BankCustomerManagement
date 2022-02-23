package com.npci.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.npci.demo.dao.TransactionDao;
import com.npci.demo.entity.Customers;
import com.npci.demo.entity.Transaction;
import com.npci.demo.repository.CustomerRepository;
import com.npci.demo.service.TransactionService;

@Service
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	TransactionDao transactionDao;
	@Autowired
	CustomerRepository customerRepository;

	@Override
	public void addTransaction(Transaction transaction) throws Exception {
		// TODO Auto-generated method stub
		int c_id = transaction.getFrom_c_id();
		Customers entity = customerRepository.getById(c_id);

		float customer_balance = entity.getBalance();
		float trans_amount = transaction.getTrans_amount();

		if (customer_balance >= trans_amount) {
			entity.setBalance(customer_balance - trans_amount);
			customerRepository.save(entity);
			transactionDao.save(transaction);

			int to_c_id = transaction.getTo_c_id();
			Customers entity2 = customerRepository.getById(to_c_id);
			entity2.setBalance(entity2.getBalance() + trans_amount);
			customerRepository.save(entity2);
		} else {
			throw new Exception("Insufficient balance");
		}
	}

	@Override
	public List<Transaction> getTransactionById(int c_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Transaction> getAllTransaction() {
		// TODO Auto-generated method stub
		return null;
	}

}
