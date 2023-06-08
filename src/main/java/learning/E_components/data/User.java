package learning.E_components.data;

import lombok.Data;

@Data
public class User {
    private String username;

    public User(String username) {
        this.username = username;
    }
}
