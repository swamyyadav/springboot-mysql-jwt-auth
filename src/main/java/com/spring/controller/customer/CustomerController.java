package com.spring.controller.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entity.customer.CustomerInfo;
import com.spring.service.customer.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerService service;
	
	@GetMapping("/customerProfile/{id}")
    public CustomerInfo customerProfile(@PathVariable("id") int id) {
        return service.customerProfile(id);
    }
	
	@PostMapping("/addCustomer")
	public CustomerInfo addCustomer(@RequestBody CustomerInfo customerInfo) {
        return service.addCustomer(customerInfo);
    }
	
	@PostMapping("/updateCustomer")
	public CustomerInfo updateCustomer(@RequestBody CustomerInfo customerInfo) {
        return service.updateCustomer(customerInfo);
    }
	
	
	
}
