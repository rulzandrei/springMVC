
package com.example.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.services.CustomerService;

public class MainApp {

	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "beans.xml" });

		CustomerService cust = (CustomerService) context.getBean("customerService");
		System.out.println(cust);

	}
}