package learning.F_component;

import learning.E_components.repositories.ProductRepository;
import learning.E_components.services.ProductService;
import learning.F_containers_for_component.Configuration01;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class D_dependencyInjectionComponent {
    //dependency injection component adalah proses memasukkan component ke dalam component lain.
    //ada dua cara dependency injection component.
    //1. inject component menggunakan constructor.
    //   -kendala.
    //    apabila component yang di inject tidak ada maka akan terjadi error.
    //lihat di package F_component.service, class ProductService.
    @Test
    public void injectComponentWithConstructor() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configuration01.class);
        ProductRepository productRepository = applicationContext.getBean("productRepository", ProductRepository.class);
        ProductService productService = applicationContext.getBean("productService", ProductService.class);
        Assertions.assertSame(productService.getProductRepository(), productRepository);
    }

    //2. inject component menggunakan setter method.
    //   -kendala.
    //    tidak ada kendala dengan cara ini.
    //lihat di package F_component.service, class ProductService.
    @Test
    public void injectComponentWithSetterMethod() {

    }
}
