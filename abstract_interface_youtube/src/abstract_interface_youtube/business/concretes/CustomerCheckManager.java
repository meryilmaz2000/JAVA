package abstract_interface_youtube.business.concretes;

import abstract_interface_youtube.business.abstracts.CustomerCheckService;
import abstract_interface_youtube.entities.concretes.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {

		return true;
	}

}
