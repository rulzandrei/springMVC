
package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.components.CustomerDAO;

@Service
public class CustomerService {

	@Autowired
	@Qualifier("customerA")
	CustomerDAO customerDAO;


	@Override
	public String toString()
	{
		return "CustomerService [customerDAO=" + customerDAO + "]";
	}

}