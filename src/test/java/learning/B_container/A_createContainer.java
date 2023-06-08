package learning.B_container;

import learning.B_containers_for_bean.ConfigurationApp01;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class A_createContainer {
    //container adalah tempat penyimpanan bean.
    //cara membuat container di spring cukup menggunakan object applicationContext.
    //object applicationContext wajib mempunyai parameter class Configuration, class configuration ini nanti yang akan menjadi
    //tempat penyimpanan bean.
    @Test
    public void createContainer() {
        //contoh cara instansiasi object container
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigurationApp01.class);
    }

}
