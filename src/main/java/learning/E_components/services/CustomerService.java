package learning.E_components.services;

import learning.E_components.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CustomerService {
    private CustomerRepository normalCustomerRepository;
    private CustomerRepository premiumCustomerRepository;


    //contoh inject component duplicate menggunakan setter method, cukup tambahkan annottaion @Qualifier.
    @Autowired
    @Qualifier(value = "normalCustomerRepository")
    public void setNormalCustomerRepository(CustomerRepository normalCustomerRepository) {
        this.normalCustomerRepository = normalCustomerRepository;
    }
    @Autowired
    @Qualifier(value = "premiumCustomerRepository")
    public void setPremiumCustomerRepository(CustomerRepository premiumCustomerRepository) {
        this.premiumCustomerRepository = premiumCustomerRepository;
    }
}
