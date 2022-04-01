package com.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import com.example.demo.Customer;

public interface CustomerService {

	void createCustomer(List<Customer> cust);

	Collection<Customer> getAllCustomers();

	Optional<Customer> findCustomerById(int id);

	void deleteCustomerById(int id);

	void deleteAllCustomer();

	void updateEmployee(Customer emp);

}
