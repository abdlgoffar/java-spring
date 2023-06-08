package learning.E_components.event;

import learning.E_components.data.User;
import org.springframework.context.ApplicationEvent;

public class LoginSuccessEvent extends ApplicationEvent {
    private final User user;

    public LoginSuccessEvent(User user) {
        super(user);
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}
