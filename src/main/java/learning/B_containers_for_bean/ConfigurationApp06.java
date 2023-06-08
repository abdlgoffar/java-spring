package learning.B_containers_for_bean;

import learning.C_beans.School;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigurationApp06 {
    //contoh cara pembuatan bean agar tidak singleton.
    @Bean
    @Scope("prototype")//dengan scope prototype maka bean ini tidak lagi singleton.
    public School school01() {
        return new School();
    }
}
