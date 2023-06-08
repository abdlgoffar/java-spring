package learning.F_component;

import learning.E_components.repositories.SupplierRepository;
import learning.F_containers_for_component.Configuration01;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class I_getComponentMulti {
    //get component multi adalah dimana suatu cara kita untuk mendapatkan lebih dari satu component.
    //contoh di bawah kita akan mencoba mendapatkan component dari class SupplierRepository;
    @Test
    public void getComponentMulti() {
        //contoh cara mendapatkan beberapa component mengunakan method getBeanProvider .
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configuration01.class);
        ObjectProvider<SupplierRepository> supplierRepositories = applicationContext.getBeanProvider(SupplierRepository.class);
        List<SupplierRepository> collect = supplierRepositories.stream().collect(Collectors.toList());
        Assertions.assertEquals(3, collect.size());
        System.out.println(collect);
    }
    @Test
    public void getComponentMultiWithComponentName() {
        //contoh cara mendapatkan beberapa component dengan nama component nya mengunakan method getBeansOfType.
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configuration01.class);
        Map<String, SupplierRepository> beansOfType = applicationContext.getBeansOfType(SupplierRepository.class);
        Assertions.assertEquals(3, beansOfType.size());
        System.out.println(beansOfType);
    }

}
