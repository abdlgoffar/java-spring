package learning.B_containers_for_bean;

import learning.C_beans.School;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ConfigurationApp03 {
    //contoh cara pembuatan primary bean.
    @Primary
    @Bean
    public School school01() {
        return new School();
    }
    @Bean(name = "school02")
    public School school02() {
        return new School();
    }
}
