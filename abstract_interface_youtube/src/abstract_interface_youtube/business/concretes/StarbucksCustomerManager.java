package abstract_interface_youtube.business.concretes;

import abstract_interface_youtube.business.abstracts.BaseCustomerManager;
import abstract_interface_youtube.business.abstracts.CustomerCheckService;
import abstract_interface_youtube.entities.concretes.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager { //implements CustomerCheckService{

	private CustomerCheckService customerCheckService;
	
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
	super();
	this.customerCheckService = customerCheckService;
}


	public void save(Customer customer) {
		if(customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("Verified Person");
			System.out.println("Saved to database : " + customer.getFirstName() + " "+ customer.getLastName());
		}
		else {
			System.out.println("Invalid information !");
		}
		
	}
	
}
