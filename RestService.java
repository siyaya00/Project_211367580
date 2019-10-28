package services;

import javax.ejb.EJB;
import javax.faces.bean.ManagedProperty;
import javax.inject.Inject;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import controller.CustomerController;
import model.Customer;
import service.CustomerEJB;

@Path("/RestService")
@ApplicationPath("/resources")
public class RestService extends Application{
	
	
	CustomerController customercontroller = new CustomerController() ;	
	
	Customer customer = new Customer();
	
	CustomerEJB customerservice = new CustomerEJB() ;	
	
	@EJB
	private CustomerController cc;

	//http://localhost:8080/frontend/resources/RestService/sayHello
	@GET
	@Path("/sayHello")
	public String getHelloMsg() {
		return "Hello World";
	}
	
	@GET
	@Path("/echo")
	public Response getEchoMsg(@QueryParam("Message") String msg)
	{
		//customerservice.addNewCustomerEntity(customer.submitMessage(msg));
		//customer.submitMessage(msg);
		//cc.addNewCustomer(msg);
		//customerservice.addNewCustomer(msg);
		customer.setName(msg);
		customerservice.addNewCustomerEntity(customer.getEntity());
		
		return Response.ok("Your message was: " + msg).build();
	}
	
}
