package com.npci.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.npci.demo.entity.Customers;
import com.npci.demo.response.TransactionResponse;
import com.npci.demo.service.CustomerService;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

	@Autowired CustomerService customerService;
	
	//display all customers
	@GetMapping("/getallcustomers")
	public ResponseEntity<List<Customers>> getAllCustomers(){
		List<Customers> customers = null;
		try {
			customers = customerService.getAllCustomers();
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
		return new ResponseEntity<List<Customers>> (customers,HttpStatus.OK);
		
	}
	
	//display customer of id
	@GetMapping("/getbyid/{id}")
	public ResponseEntity<Customers> getById(@PathVariable ("id") int c_id){
		Customers customers = null;
		try {
			customers = customerService.getById(c_id);
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
		return new ResponseEntity<Customers>(customers,HttpStatus.OK);
		
	}
	
	//display customers of a particular location
	@GetMapping("/getbylocation/{address}")
	public ResponseEntity<List<Customers>> getbyLoc(@PathVariable("address") String address){
		List<Customers> customers = null;
		try {
			customers = customerService.getbyLoc(address);
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
		return new ResponseEntity<List<Customers>> (customers,HttpStatus.OK);	
	}
	
	//add a new customer
	@PostMapping("/addcustomer")
	public ResponseEntity<Customers> addCustomer(@RequestBody Customers customers) {
		Customers customer =null;
		try {
			customer = customerService.addCustomer(customers);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return new ResponseEntity<Customers>(customer,HttpStatus.ACCEPTED);
	}
	
	//delete an existing customer
	@DeleteMapping("/deletecustomer/{id}")
	public String deleteCustomer(@PathVariable ("id") int c_id){
		String customers = null;
		try {
			customers = customerService.deleteCustomer(c_id);
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
		return  customers;
		
	}
	//transaction details of customers
	@GetMapping("/gettransactiondetails")
	public ResponseEntity<List<TransactionResponse>> getTransDetails() {
		List<TransactionResponse> customer = null;
		try {
			customer = customerService.getTransDetails();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return new ResponseEntity<List<TransactionResponse>>(customer,HttpStatus.ACCEPTED);
				
	}
}
