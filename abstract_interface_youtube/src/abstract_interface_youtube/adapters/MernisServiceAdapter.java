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

/*
 * Hata alanlar için bir arkadaþ paylaþmýþtý bende paylaþayým Mernis sistemini eclipse yükledikten sonra hata alanlar bu iþlemi yapabilirler.

 Mernis servisini eklemek için 
Projeye sað týklayýp New>Other>Web Service >Web Service Client kýsmýna týklayýp yukarýda 
yazan Browse kýsmýna https://tckimlik.nvi.gov.tr/Service/KPSPublic.asmx?wsdl yazýp finish diyin.

 Service baðlý olasý hatalarýn olasý çözümü için 
Projeye sað týklayýp en altta Properties>Java Complier>Configure Workspace Settings...
(Sað üstte yazýyor týklayýn)>açýlan sayfada Complier compliance level kýsmýný 1.8 yapýn> 
ardýndan Use default compliance settings tikini kaldýrýn. Apply and Close diyin.
*/