package learning.C_bean;

import learning.B_containers_for_bean.ConfigurationApp05;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class G_setCreateBean {
    //set create bean atau DependsOn adalah proses setting bean mana yang dibuat pertama
    //atau bean mana yang dibuat terakhir dalam container nya.
    //cara untuk create bean atau DependsOn cukup dengan menambah annotation @DependsOn
    //lihat di package B_containers_for_bean, class ConfigurationApp05.
    @Test
    public void setCreateBean() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigurationApp05.class);
    }
}
