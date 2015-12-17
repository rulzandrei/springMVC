
package com.example.components;

import org.springframework.stereotype.Component;

@Component
public class CustomerDAO {

	private String name;
	
	@Override
	public String toString()
	{
		return "Hello , This is CustomerDAO with name:" + name;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
}