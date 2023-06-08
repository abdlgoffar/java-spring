package learning.E_components.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class LoginSuccessListener implements ApplicationListener<LoginSuccessEvent> {

    @Override
    public void onApplicationEvent(LoginSuccessEvent event) {
        System.out.println("succes login for user: " + event.getUser());
    }
}
