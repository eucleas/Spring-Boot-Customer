package com.example.demo;

import java.util.Map;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	//CustomerManager cManager = new CustomerManager();

	 CustomerManager cManager = new CustomerManager();

	@PostMapping("/add")
	public Map<String,Customer> add(@Validated @RequestBody final Customer person) {
		cManager.customerMap.put(person.getUsername(), person);
		return cManager.getCustomerMap();
	}
	
	@GetMapping("/all")
	public CustomerManager get() {
		return cManager;
	}
	
	@GetMapping("/remove")
	public CustomerManager remove(@RequestParam ("username") final String userName) {
		cManager.customerMap.remove(userName);
		return cManager;
	}
}
