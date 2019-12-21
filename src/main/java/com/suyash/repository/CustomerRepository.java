package com.suyash.repository;

import java.util.List;

import com.suyash.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}