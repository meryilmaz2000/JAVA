package abstract_interface_youtube;

import java.time.LocalDate;

import abstract_interface_youtube.adapters.MernisServiceAdapter;
import abstract_interface_youtube.business.abstracts.BaseCustomerManager;
import abstract_interface_youtube.business.concretes.NeroCustomerManager;
import abstract_interface_youtube.business.concretes.StarbucksCustomerManager;
import abstract_interface_youtube.entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(3,"Melikþah","Eryýlmaz",LocalDate.of(2001, 10,18),"11111111111"));
		
		BaseCustomerManager customerManager2 = new NeroCustomerManager();
		customerManager2.save(new Customer(3,"Melikþah","Eryýlmaz",LocalDate.of(2001, 10,18),"11111111111"));
	
	}

}
