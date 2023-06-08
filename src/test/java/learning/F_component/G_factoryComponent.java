package learning.F_component;

import learning.E_components.client.ClientSellerApi;
import learning.F_containers_for_component.Configuration01;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class G_factoryComponent {
    //factory component biasa digunakan untuk membuat class wrapper atau class tiruan pada saat kita menggunakan
    // dependency atau library orang lain.
    //lihat di package F_component.repositories, class ClientSellerApiFactoryBean.
    @Test
    public void factoryComponent() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configuration01.class);
        ClientSellerApi clientSellerApi = applicationContext.getBean("clientSellerApi", ClientSellerApi.class);
        Assertions.assertNotNull(clientSellerApi);
        Assertions.assertEquals("https/toko-sembako.com", clientSellerApi.getEndPoint());
    }

}
