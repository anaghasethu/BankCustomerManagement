package com.npci.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.npci.demo.entity.Transaction;

@Service
public interface TransactionService {

	public List<Transaction> getTransactionById(int c_id);

	public List<Transaction> getAllTransaction();

	public void addTransaction(Transaction transaction) throws Exception;

}
