package com.demoorg.customerservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demoorg.customerservice.model.Customer;
import com.demoorg.customerservice.repository.CustomerRepository;



@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private CustomerRepository customerRepository;
	
	@GetMapping("/getallcust")
	public List<Customer> getAllCustomers(){
		return customerRepository.findAll();
		
	}
	
	@GetMapping("/getcust/{cid}")
	public Optional<Customer> getCustomer(@PathVariable int cid) {
		return customerRepository.findById(cid);
	}
	
	@PostMapping("/addcust")
	public String addCustomer(@RequestBody Customer customer) {
		customerRepository.save(customer);
		return "Customer added with Id: " + customer.getCId();
	}
	
	@PutMapping("/updatecust/{cid}")
	public String updateCustomer(@PathVariable int cid, @RequestBody Customer customer) {
		customer.setCId(cid);
	    customerRepository.save(customer);
	    return "Customer updated with Id: " + cid;
	}
	
	@DeleteMapping("/delete/{cid}")
	public String deleteCustomer(@PathVariable int cid) {
		customerRepository.deleteById(cid);
		return "Customer deleted with Id: "+cid;
	}
}
