package learning.G_event;

import learning.E_components.services.UserService;
import learning.F_containers_for_component.Configuration01;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class A_event {
    //event adalah class yang bisa melakukan pengiriman data.
    //untuk membuat class yang bisa melakukan event maka class tersebut harus extends ke ApplicationEvent, lihat di package
    //components.event class LoginSuccessEvent.
    //dan data event hanya bisa di terima oleh component yang Implement ke Interface ApplicationListener, lihat di package
    //components.event class LoginSuccessListener.
    @Test
    public void event() {
        //lihat di package components.services class UserService,
        //disana terdapat kode yang melakukan validasi pembuatan dan penerimaan event.
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configuration01.class);
        UserService userService = applicationContext.getBean(UserService.class);
        userService.login("goffar", "goffar");
        userService.login("goffar", "salah");
        userService.login("salah", "salah");
    }

}
