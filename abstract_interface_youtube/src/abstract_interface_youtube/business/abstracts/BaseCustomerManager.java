package abstract_interface_youtube.business.abstracts;

import abstract_interface_youtube.entities.concretes.Customer;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public void save(Customer customer) {
		System.out.println("Saved to database : " + customer.getFirstName() + " "+ customer.getLastName());
		
	}

}
