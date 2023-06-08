package learning.C_bean;


import learning.B_containers_for_bean.ConfigurationApp06;
import learning.C_beans.School;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class F_lazyBean {
    //lazy bean adalah cara mengubah bean menjadi tidak singleton.
    //untuk membuat bean tidak singleton cukup menambahkan annotation @Scope.
    //lihat di package B_containers_for_bean, class ConfigurationApp06.
    @Test
    public void lazyBean() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigurationApp06.class);
        School school01 = applicationContext.getBean("school01", School.class);
        School school02 = applicationContext.getBean("school01", School.class);
        Assertions.assertNotSame(school01, school02);//seharusnya kedua object ini tidak sama karena scope bean nya sudah di set prototype
    }
}
