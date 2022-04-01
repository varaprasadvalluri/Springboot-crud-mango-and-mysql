package com.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Customer;
import com.example.demo.CustomerRepository;

@Service
public class Customerserviceimpl implements CustomerService {

	// The dao repository will use the Mongodb-Repository to perform the database
	// operations.
	@Autowired
	CustomerRepository dao;

	
	@Override
	public void createCustomer(List<Customer> cust) {
		dao.saveAll(cust);
	}

	@Override
	public Collection<Customer> getAllCustomers() {
		return dao.findAll();
	}
	@Override
	public Optional<Customer> findCustomerById(int id) {
		return dao.findById(id);
	}

	@Override
	public void deleteCustomerById(int id) {
		dao.deleteById(id);
	}


	@Override
	public void updateEmployee(Customer emp) {
		dao.save(emp);
	}

	@Override
	public void deleteAllCustomer() {
		dao.deleteAll();
	}
}
