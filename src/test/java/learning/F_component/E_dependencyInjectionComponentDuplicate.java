package learning.F_component;

import learning.E_components.services.CustomerService;
import learning.F_containers_for_component.Configuration01;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class E_dependencyInjectionComponentDuplicate {
    //dependency injection component duplicate adalah proses memasukkan component ke componet lain, tapi component
    //yang ingin di masukkan ke component lain itu tersedia dua di dalam container nya.
    //lihat di package F_component.service, class CustomerService.
    @Test
    public void dependencyInjectionComponentDuplicate() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configuration01.class);
        applicationContext.getBean("customerService", CustomerService.class);
    }
}
