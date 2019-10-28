package controller;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import model.Customer;
import service.CustomerEJB;

import javax.ws.rs.QueryParam;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;


@ManagedBean(name="customerController")
@SessionScoped
public class CustomerController {
	
	@EJB
	CustomerEJB customerservice;
	
	
	@ManagedProperty(value= "#{customer}")
	private Customer customer;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
 	

	public void addNewCustomer(String msg)
	{
		System.out.println("Works : " + msg);
		customer.setName(msg);
		customerservice.addNewCustomerEntity(customer.getEntity());
	}
	
	
	public void tweetCall(){
		Client client = ClientBuilder.newClient();
		
		Customer c = client.target("http://localhost:8080/frontend/resources/RestService/object?Message=Lvert").request().get(Customer.class);
		
	}
	
	
}
