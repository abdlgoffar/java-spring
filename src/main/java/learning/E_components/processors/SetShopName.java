package learning.E_components.processors;

import learning.E_components.helpers.IdUnique;
import learning.E_components.helpers.ShopName;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class SetShopName implements BeanPostProcessor, Ordered {
    //di bawah ini contoh cara membuat  post processor.
    @Override
    public Object postProcessAfterInitialization(Object component, String beanName) throws BeansException {
        if (component instanceof ShopName){
            ShopName shopName = (ShopName) component;
            shopName.setName("SHOP ABDUL GOFFAR");
        }
        return component;
    }

    //di bawah ini adalah contoh membuat post processor component ordered.
    //syaratnya cukup implements component  post processor nya ke Interface Ordered, lalu return nomor urutnya di method getOrder()
    @Override
    public int getOrder() {
        return 1;
    }
}
