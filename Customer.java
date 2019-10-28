package model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import model.CustomerEntity;

@ManagedBean(name = "customer")
@SessionScoped

public class Customer {
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public CustomerEntity getEntity(String msg)
//	{
//		CustomerEntity customerEntity = new CustomerEntity();
//		customerEntity.setName(msg);
//		return customerEntity;
//	}
	
	public CustomerEntity getEntity()
	{
		CustomerEntity customerEntity = new CustomerEntity();
		customerEntity.setName(name);
		return customerEntity;
	}
	
	public CustomerEntity submitMessage(String msg)
	{
		CustomerEntity customerEntity = new CustomerEntity();
		customerEntity.setName(name);
		return customerEntity;
	}
}
