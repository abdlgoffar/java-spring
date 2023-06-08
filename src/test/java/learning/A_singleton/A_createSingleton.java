package learning.A_singleton;

import learning.A_singletons.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class A_createSingleton {
    //singleton adalah konsep pembuatan class yang object nya tidak bisa di buat atau instansiasi kecuali menggunakan
    //method getInstance() nya.
    //berapapun object class singleton di instansiasi hasil objectnya tetap sama.
    //lihat package A_singletons, class Person.
    @Test
    public void createSingleton() {
        Person person01 = Person.getInstance();
        Person person02 = Person.getInstance();
        Assertions.assertSame(person01, person02);
    }
}
