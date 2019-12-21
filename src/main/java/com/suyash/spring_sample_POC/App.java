package com.suyash.spring_sample_POC;

import com.suyash.service.CustomerService;
import com.suyash.service.CustomerServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	CustomerService service = new CustomerServiceImpl();
        System.out.println(service.findAll().get(0).getFirstName());
        System.out.println(service.findAll().get(0).getLastName());
    }
}
