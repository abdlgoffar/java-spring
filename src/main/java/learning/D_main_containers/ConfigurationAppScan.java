package learning.D_main_containers;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//contoh cara melakukan scan container
@Configuration
@ComponentScan(basePackages = {
        "learning.B_containers_for_bean"
})
public class ConfigurationAppScan {
}
