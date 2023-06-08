package learning.B_containers_for_bean;

import learning.C_beans.School;
import learning.C_beans.Teacher;
import learning.C_beans.University;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;

public class ConfigurationApp04 {
    @Bean(name = "university01")
    public University university01() {
        return new University();
    }
    @Bean(name = "university02")
    public University university02() {
        return new University();
    }
    @Bean
    public Teacher teacher01() {
        return new Teacher();
    }
    //contoh cara inject bean tanpa menyebut nama bean nya.
    @Bean(name = "school01")
    public School school01(Teacher teacher) {
        return new School(teacher);
    }
    //contoh cara inject bean dengan menyebut name bean nya.
    //caranya cukup dengan menambahkan annotation @Qualifier.
    @Bean(name = "school02")
    public School school02(@Qualifier(value = "university02") University university) {
        return new School(university);
    }

}
