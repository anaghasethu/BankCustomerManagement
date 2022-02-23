package com.npci.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.npci.demo.entity.CustomerDetails;
import com.npci.demo.entity.Customers;
import com.npci.demo.response.TransDetails;

@Repository
public interface CustomerRepository extends CrudRepository<Customers, Integer> {

	@Query(value = "select * from customer_details where address = :address", nativeQuery = true)
	public List<Customers> getbyLoc(@Param("address") String address);

}
