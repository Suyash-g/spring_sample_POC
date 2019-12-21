package com.suyash.service;

import java.util.List;

import com.suyash.model.Customer;
import com.suyash.repository.CustomerRepository;
import com.suyash.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository customerRepo = new HibernateCustomerRepositoryImpl();
	
	@Override
	public List<Customer> findAll(){
		return customerRepo.findAll();
	}
	
}
