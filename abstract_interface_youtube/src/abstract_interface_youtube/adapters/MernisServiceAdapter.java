package abstract_interface_youtube.adapters;

import abstract_interface_youtube.business.abstracts.CustomerCheckService;
import abstract_interface_youtube.entities.concretes.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	boolean checkResult = false;
	KPSPublicSoapProxy client = new KPSPublicSoapProxy();
	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		
		try {
			checkResult = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId())
											,customer.getFirstName(),
											 customer.getLastName(),
											 customer.getDateOfBirth().getYear());
			
			}
		catch (Exception e) 
			{	
			System.out.println("Invalid person");
			}	
			
		return checkResult;	
		
	}

}
