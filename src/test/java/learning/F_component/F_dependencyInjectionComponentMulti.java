package learning.F_component;

import learning.E_components.services.SupplierService;
import learning.F_containers_for_component.Configuration01;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class F_dependencyInjectionComponentMulti {
    //dependency injection component multi merupakan proses inject component yang lebih dari satu data
    // dan type data nya sama, untuk melakukan dependency injection component multi cukup menggunakan type data Provider<T>.
    //lihat di package F_component.service, class SupplierService.
    @Test
    public void dependencyInjectionComponentMulti() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configuration01.class);
        SupplierService supplierService = applicationContext.getBean("supplierService", SupplierService.class);
        Assertions.assertNotNull(supplierService);
        Assertions.assertEquals(3, supplierService.getSupplierRepositories().size());
    }
}
