package learning.E_components.processors;

import learning.E_components.helpers.IdUnique;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class SetIdUnique implements BeanPostProcessor, Ordered {
    //di bawah ini contoh cara membuat  post processor.
    //dimana component yang turunan Interface IdUnique field id nya akan di set.
    @Override
    public Object postProcessAfterInitialization(Object component, String beanName) throws BeansException {
        if (component instanceof IdUnique)/*check apakah component turunan dari interface IdUnique*/{
            IdUnique idUnique = (IdUnique) component;//convert component menjadi object type IdUnique.
            idUnique.setId(UUID.randomUUID().toString());
        }
        return component;
    }
    //di bawah ini adalah contoh membuat post processor component ordered.
    //syaratnya cukup implements component  post processor nya ke Interface Ordered, lalu return nomor urutnya di method getOrder()
    @Override
    public int getOrder() {
        return 2;
    }
}
