package learning.B_containers_for_bean;

import learning.C_beans.School;
import learning.C_beans.Teacher;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;

import java.util.Optional;

public class ConfigurationApp07 {
    //contoh cara membuat dependency injection optional.
    @Bean(name = "school01")
    public School school01(@Qualifier(value = "teacher01")Optional<Teacher> teacher) {
        return new School(teacher.orElse(null));
    }
}
