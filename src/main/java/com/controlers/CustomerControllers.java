package com.controlers;

import java.util.Collection;
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

import com.example.demo.Customer;
import com.service.CustomerService;

@RestController
@RequestMapping("/api/mongo/cust")
public class CustomerControllers {
	@Autowired
	private CustomerService serv;

//	private final Logger logger = LoggerFactory.getLogger(this.getClass());


	@PostMapping("/create")
	public String create(@RequestBody List<Customer> emp) {
//		logger.debug("Saving employees.");
		serv.createCustomer(emp);
		return "Employee records created.";
	}

	@GetMapping("/getall")
	public Collection<Customer> getAll() {
//		logger.debug("Getting all employees.");
		return serv.getAllCustomers();
	}

	@GetMapping("/getbyid/{custId}")
	public Optional<Customer> getById(@PathVariable("custId") int id) {
//		logger.debug("Getting employee with employee-id= {}.", id);
		return serv.findCustomerById(id);
	}


	@PutMapping("/update/{employee-id}")
	public String update(@PathVariable("employee-id") int id, @RequestBody Customer e) {
//		logger.debug("Updating employee with employee-id= {}.", id);
//		e.firstName=this.id;
		serv.updateEmployee(e);
		return "Employee record for employee-id= " + id + " updated.";
	}

	@DeleteMapping("/delete/{employee-id}")
	public String delete(@PathVariable("employee-id")
	int id) {
//		logger.debug("Deleting employee with employee-id= {}.", id);
		serv.deleteCustomerById(id);
		return "Employee record for employee-id= " + id + " deleted.";
	}

	@DeleteMapping("/deleteall")
	public String deleteAll() {
//		logger.debug("Deleting all employees.");
		serv.deleteAllCustomer();
		return "All employee records deleted.";
	}
	
	
}
