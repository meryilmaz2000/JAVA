package abstract_interface_youtube.business.abstracts;

import abstract_interface_youtube.entities.concretes.Customer;

public interface CustomerCheckService {

	public boolean CheckIfRealPerson(Customer customer);
}
