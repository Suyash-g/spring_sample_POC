package com.suyash.repository;

import java.util.ArrayList;
import java.util.List;

import com.suyash.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	@Override
	public List<Customer> findAll(){
		
		List<Customer> customers = new ArrayList<>();
		Customer customer = new Customer();
		
		customer.setFirstName("Hello");
		customer.setLastName("springPOC");
		
		customers.add(customer);
		
		return customers;
	}

}
