package learning.E_components.services;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class CategoryService implements ApplicationContextAware {
    private ApplicationContext containerName;
    //contoh get container atau ApplicationContext sebuah compoennt.
    //class component cukup implement Interface ApplicationContextAware.
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.containerName = applicationContext;
    }

    public ApplicationContext getContainerName() {
        return containerName;
    }
}

