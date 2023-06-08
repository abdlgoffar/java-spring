package learning.F_component;

import learning.E_components.services.OrderService;
import learning.F_containers_for_component.Configuration01;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class J_postProcessorComponent {
    //post processor component adalah cara untuk memodifikasi component.
    //cara untuk membuat post processor component cukup membuat component yang implement ke Interface BeanPostProcessor,
    //nanti component yang ingin di modifikasi akan di proses di dalam component yang implement ke Interface BeanPostProcessor tersebut.
    //lihat di package F_component.processors, class SetIdUnique.
    @Test
    public void postProcessorComponent() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configuration01.class);
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
        System.out.println("ID unique: " + orderService.getId());
    }
}
