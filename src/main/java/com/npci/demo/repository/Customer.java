package com.npci.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.npci.demo.entity.Transaction;

@Repository
public interface Customer extends JpaRepository<Transaction,Integer>{

}
