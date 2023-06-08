package learning.E_components.repositories;

import learning.E_components.helpers.ShopName;

public class OrderRepository implements ShopName {
    private String name;
    @Override
    public void setName(String name) {
        this.name = name;
    }
}
