package learning.F_component;

import learning.E_components.repositories.ProductRepository;
import learning.F_containers_for_component.Configuration01;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class B_getComponent {
    //get component adalah proses pemanggilan component dari dalam container.
    @Test
    public void getComponent() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configuration01.class);
        ProductRepository productRepository01 = applicationContext.getBean("productRepository", ProductRepository.class);
        ProductRepository productRepository02 = applicationContext.getBean("productRepository", ProductRepository.class);
        Assertions.assertSame(productRepository01, productRepository02);
    }
}
