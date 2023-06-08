package learning.A_singletons;

public class Person {
    //contoh pembuatan class singleton

    private Person()/*constructor nya dijadikan private biar object nya hanya  bisa dibuat lewat method getInstance()*/ {
    }

    private static Person person;
    public static Person getInstance() {
        if ( Person.person == null) {
            Person.person = new Person();
        }
        return  Person.person;
    }
}
