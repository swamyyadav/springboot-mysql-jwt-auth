package com.spring.repository.customer;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entity.customer.CustomerInfo;

public interface CustomerInfoRepository extends JpaRepository<CustomerInfo, Integer> {
	CustomerInfo findByName(String customerName);
	CustomerInfo findById(int id);

}
