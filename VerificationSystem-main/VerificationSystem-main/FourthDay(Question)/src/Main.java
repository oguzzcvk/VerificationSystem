import Mernis.NBWKPSPublicSoap;

public class Main {

    public static void main(String[] args) throws Exception {

        BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
        customerManager.save(new Customer(1,"Oğuzhan","Çevik",1999,"62059465568"));

    }
}
