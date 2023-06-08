package learning.C_bean;

import learning.B_containers_for_bean.ConfigurationApp04;
import learning.C_beans.School;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class D_dependencyInjectionBean {
    //dependency injection bean  adalah proses memasukkan bean ke dalam bean lain.
    //ada beberapa contoh dependency injection.
    //1. inject bean tanpa menyebut nama bean nya.
    //   -kendala.
    //    apabila bean yang di inject duplicate atau dalam satu container terdapat dua bean mempunyai type data sama akan terjadi error.
    //lihat di package B_containers_for_bean, class ConfigurationApp04.
    @Test
    public void injectBeanWithoutNameBean() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigurationApp04.class);
        School school = applicationContext.getBean("school01", School.class);
        Assertions.assertNotSame(school, school.getTeacher());
    }

    //1. inject bean dengan menyebut nama bean nya.
    //   -kendala.
    //    tidak ada kendala dengan cara ini.
    //lihat di package B_containers_for_bean, class ConfigurationApp04.
    @Test
    public void injectBeanWithName() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigurationApp04.class);
        School school = applicationContext.getBean("school02", School.class);
        Assertions.assertNotSame(school, school.getUniversity());
    }
}
