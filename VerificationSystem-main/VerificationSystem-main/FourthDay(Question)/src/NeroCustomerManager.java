public class NeroCustomerManager extends BaseCustomerManager {

    private ICustomerCheckService customerCheckService;

    public NeroCustomerManager(ICustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void save(Customer customer) throws Exception {

        if (customerCheckService.checkIfRealPerson(customer)) {
            super.save(customer);
        } else {
            System.out.println("Hata!!!!!");
        }


    }
}
