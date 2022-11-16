
import java.util.*;

public class PersonList {

    public static void main(String[] args) {

        ArrayList<Person> list = new ArrayList<Person>(); //коллекция элементов класса персон
        Person p1 = new Person("Haim", 35);
        Person p2 = new Person("Sarah", 27);
        Person p3 = new Person("Moshe", 19);
        Person p4 = new Person("Moshe", 19);
        Person p5 = new Person("Moshe", 44);

        list.add(p3);
        list.add(p1);
        list.add(p2);
        list.add(p5);

        System.out.println(list);

        list.add(3, p2);

        System.out.println(list);

        list.remove(p2);
        System.out.println(list);

        list.remove(p5);
        System.out.println(list);

        for (Person p : list) {
            System.out.println(p);
        }
    }

}
