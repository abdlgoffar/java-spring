package learning.E_components.services;

import learning.E_components.data.User;
import learning.E_components.event.LoginSuccessEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class UserService implements ApplicationEventPublisherAware {
    ApplicationEventPublisher applicationEventPublisher;
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
    public boolean login(String username, String password) {
        if (isLoginSucces(username, password)) {
            //jika method isLoginSucces() true, maka event akan dibuat dengan cara seperti di bawah.
            this.applicationEventPublisher.publishEvent(new LoginSuccessEvent(new User("goffar")));
            return true;
        }else {
            return false;
        }
    }

    private boolean isLoginSucces(String username, String password) {
        return "goffar".equals(username) && "goffar".equals(password);
    }
}
