package learning.C_bean;

import learning.B_containers_for_bean.ConfigurationApp07;
import learning.C_beans.School;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class E_dependencyInjectionBeanOptional {
    //dependency injection bean optional digunakan pada saat proses dependency injection, karena secara default pada saat proses
    //dependency injection, bean yang di inject ke dalam bean lain tidak boleh null atau object yang di inject harus ada
    //karena jika tidak ada, maka akan terjadi error, dengan dependency injection bean optional meski object nya null atau tidak ada
    //nanti tidak akan terjadi error.
    //lihat di package B_containers_for_bean, class ConfigurationApp07.
    @Test
    public void dependencyInjectionBeanOptional() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigurationApp07.class);
        School school01 = applicationContext.getBean("school01", School.class);
        Assertions.assertNull(school01.getTeacher());
    }
}
