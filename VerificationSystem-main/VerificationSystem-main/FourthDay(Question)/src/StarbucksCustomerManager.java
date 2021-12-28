public class StarbucksCustomerManager extends BaseCustomerManager implements  ICustomerCheckService   {
    ICustomerCheckService customerCheckService;

    public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public boolean checkIfRealPerson(Customer customer) {
        return false;
    }
    @Override
    public void save(Customer customer) throws Exception {

        if(customerCheckService.checkIfRealPerson(customer)){
            super.save(customer);
        }
        else {
            System.out.println("Hata!!!!!");
        }


    }
}
