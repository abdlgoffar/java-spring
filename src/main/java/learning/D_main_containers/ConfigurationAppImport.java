package learning.D_main_containers;

import learning.B_containers_for_bean.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//contoh pengelompokan container menggunakan import.
@Configuration
@Import(value = {
        ConfigurationApp01.class,
        ConfigurationApp02.class,
        ConfigurationApp03.class,
        ConfigurationApp04.class,
        ConfigurationApp05.class,
        ConfigurationApp06.class
})
public class ConfigurationAppImport {

}
