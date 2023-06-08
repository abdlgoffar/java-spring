package learning.C_bean;

import learning.B_containers_for_bean.ConfigurationApp03;
import learning.C_beans.School;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class C_getBean {
    //get bean adalah proses pemanggilan bean dari dalam container.
    //ada beberapa contoh pemanggilan bean.
    //1. pemanngilan bean tanpa nama.
    //  -kendala
    //   apabila terdapat bean yang duplicate atau dalam satu container terdapat dua bean mempunyai type data sama
    //   dan pada salah satu bean itu tidak dijadikan @Primary maka akan terjadi error.
    @Test
    public void getBeanWithoutName() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigurationApp03.class);
        applicationContext.getBean(School.class);
    }
    //2. pemanggilan bean dengan nama.
    //  -kendala
    //   tidak ada kendala dengan cara ini.
    @Test
    public void getBeanWithName() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigurationApp03.class);
        applicationContext.getBean("school02", School.class);
    }



}
