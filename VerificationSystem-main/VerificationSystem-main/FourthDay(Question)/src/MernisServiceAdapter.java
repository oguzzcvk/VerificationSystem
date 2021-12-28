import Mernis.NBWKPSPublicSoap;

import java.util.Locale;

public class MernisServiceAdapter implements ICustomerCheckService{


    @Override
    public boolean checkIfRealPerson(Customer customer) throws Exception {
        NBWKPSPublicSoap client = new NBWKPSPublicSoap();


        return client.TCKimlikNoDogrula(Long.valueOf(customer.nationalId), customer.firstName.toUpperCase(), customer.lastName.toUpperCase(),customer.id);
    }
}
