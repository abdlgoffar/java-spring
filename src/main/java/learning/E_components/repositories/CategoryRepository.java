package learning.E_components.repositories;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//contoh cara pembuatan component agar tidak singleton.
@Scope(value = "prototype")//dengan scope prototype maka component ini tidak lagi singleton.
public class CategoryRepository {
}
