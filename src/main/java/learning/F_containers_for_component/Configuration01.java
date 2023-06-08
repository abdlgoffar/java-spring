package learning.F_containers_for_component;

import learning.E_components.repositories.CustomerRepository;
import learning.E_components.repositories.SupplierRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(
        basePackages = {
                "learning.E_components"
        }
)
public class Configuration01 {

        @Bean
        public SupplierRepository supplierRepository01() {
                return new SupplierRepository();
        }
        @Bean
        public SupplierRepository supplierRepository02() {
                return new SupplierRepository();
        }
        @Bean
        public SupplierRepository supplierRepository03() {
                return new SupplierRepository();
        }
        @Bean
        public CustomerRepository normalCustomerRepository() {
                return new CustomerRepository();
        }
        @Bean
        public CustomerRepository premiumCustomerRepository() {
                return new CustomerRepository();
        }
}
