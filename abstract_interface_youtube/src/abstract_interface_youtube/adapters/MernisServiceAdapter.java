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
 * Hata alanlar i�in bir arkada� payla�m��t� bende payla�ay�m Mernis sistemini eclipse y�kledikten sonra hata alanlar bu i�lemi yapabilirler.

 Mernis servisini eklemek i�in 
Projeye sa� t�klay�p New>Other>Web Service >Web Service Client k�sm�na t�klay�p yukar�da 
yazan Browse k�sm�na https://tckimlik.nvi.gov.tr/Service/KPSPublic.asmx?wsdl yaz�p finish diyin.

 Service ba�l� olas� hatalar�n olas� ��z�m� i�in 
Projeye sa� t�klay�p en altta Properties>Java Complier>Configure Workspace Settings...
(Sa� �stte yaz�yor t�klay�n)>a��lan sayfada Complier compliance level k�sm�n� 1.8 yap�n> 
ard�ndan Use default compliance settings tikini kald�r�n. Apply and Close diyin.
*/