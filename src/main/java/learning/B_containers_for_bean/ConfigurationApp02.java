package learning.B_containers_for_bean;

import learning.C_beans.School;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationApp02 {
    //contoh cara pembuatan bean tanpa nama.
    @Bean
    public School school01() {
        return new School();
    }
    //contoh cara pembuatan primary bean
    @Bean(name = "school02")
    public School school02() {
        return new School();
    }
}
