public abstract class BaseCustomerManager implements ICustomerService{
    @Override
    public  void save(Customer customer) throws Exception {
        System.out.println("Veritabanına Kaydedildi."+customer.firstName);
    }
}
