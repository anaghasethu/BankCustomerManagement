package com.npci.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.npci.demo.entity.CustomerDetails;

@Repository
public interface CustomerDetailsRepo extends CrudRepository<CustomerDetails, Integer> {

}
