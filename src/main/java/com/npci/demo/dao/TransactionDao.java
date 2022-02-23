package com.npci.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.npci.demo.entity.Transaction;

public interface TransactionDao extends JpaRepository<Transaction, Integer> {

}
