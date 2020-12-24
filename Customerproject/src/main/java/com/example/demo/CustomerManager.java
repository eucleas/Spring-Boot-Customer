package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class CustomerManager {

	 Map<String,Customer> customerMap=new HashMap<String, Customer>();

	public Map<String, Customer> getCustomerMap() {
		return customerMap;
	}

	public void setCustomerMap(Map<String, Customer> customerMap) {
		this.customerMap = customerMap;
	}
	 
	
	
}
