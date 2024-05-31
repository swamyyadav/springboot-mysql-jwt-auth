package com.spring.service.customer;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.entity.customer.CustomerInfo;
import com.spring.repository.customer.CustomerInfoRepository;

@Service
public class CustomerService {
	@Autowired
	CustomerInfoRepository customerRep;
	
	public CustomerInfo addCustomer(CustomerInfo customerInfo) {
		CustomerInfo customer = customerRep.save(customerInfo);
        return customer;
    }
	
	public CustomerInfo updateCustomer(CustomerInfo customerInfo) {
		CustomerInfo customer = customerRep.findById(customerInfo.getId());
		customer.setCustomerStatus(customerInfo.getCustomerStatus());
		customer.setEmail(customerInfo.getEmail());
		customer.setName(customerInfo.getName());
		customer.setPhone(customerInfo.getPhone());		
		customerRep.save(customer);		
		return customer;
	}
	
	public CustomerInfo customerProfile(int id) {
		CustomerInfo customer = customerRep.findById(id);
		return customer;
	}
	

}
