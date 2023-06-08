package learning.F_component;

import learning.E_components.repositories.CategoryRepository;
import learning.F_containers_for_component.Configuration01;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class C_lazyComponent {
    //lazy component adalah cara mengubah component menjadi tidak singleton karena secar default component itu singleton.
    //untuk membuat component tidak singleton cukup menambahkan annotation @Scope.
    //lihat di package F_components.repositories, class CategoryRepository.
    @Test
    public void lazyComponent() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configuration01.class);
        CategoryRepository categoryRepository01 = applicationContext.getBean("categoryRepository", CategoryRepository.class);
        CategoryRepository categoryRepository02 = applicationContext.getBean("categoryRepository", CategoryRepository.class);
        Assertions.assertNotSame(categoryRepository01, categoryRepository02);
    }
}