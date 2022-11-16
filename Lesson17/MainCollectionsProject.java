
import java.util.*;

public class MainCollectionsProject {

    public static void main(String[] args) {

        ArrayList<Object> list = new ArrayList<>();
        list.add(5);
        list.add('v');
        list.add("Hi");
        list.add(7.8);
        list.add(new MyObject());
        System.out.println(list);
        System.out.println(list.subList(1, 3)); //не включая 3
        list.remove(1);
        System.out.println(list);
        list.remove("Hi");
        System.out.println(list);

        System.out.println(list.get(0)); //вытащить элемент коллекции по индекс

        for (Object o : list) { //List is iterable
            System.out.println(o);
        }

        System.out.println(list.contains("Hi"));
        list.removeAll(list);
        System.out.println(list);
        System.out.println(list.isEmpty());

        LinkedList<Integer> llist = new LinkedList<>();
        llist.add(5);
        llist.set(0, 7);
        System.out.println(llist);
        llist.clear();
        System.out.println(llist);
        llist.add(5);
        llist.add(6);
        llist.add(5);
        llist.add(4);
        System.out.println(llist);

        ArrayList<String> als = new ArrayList<String>();

        String s2 = "Anton";
        String s4 = "Beniamin";
        String s3 = "Arina";
        String s5 = "David";
        als.add(s5);
        als.add(s2);
        als.add(s4);
        als.add(s3);

        Collections.sort(als); //статик методы курсивом
        System.out.println(als);
        Collections.reverse(als);
        System.out.println(als);

        // als. покажет все методы, которые реализованны в коллекции ArrayList, которой als принадлежит
    }

}

/*

JFC - Java Collection Framework -> java.util


                      [Collection]
             |                          |
          [List]                      [Set]
    |                |          |                |
[ArrayList]     [LinkedList]  [HashSet]       [TreeSet}
                                |
                               [LinkedHashSet]


                                 index -> [][][][][][][][]
                ArrayList list <- Object o1, Object o2
                                     |          |
                       int = 5 == Integer(5)  char 'v' == Character()

                 
                             [o4]      [o3]
                                                   [o2]
                                    head[o1]    tail
                 LinkedList list <- Object o1, Object o2
*/
