package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> al1 = new ArrayList<>();
        al1.add("Zaur");
        al1.add("Ivan");
        al1.add("Mariya");
        al1.add("Kolya");
        al1.add("Elena");

        Iterator<String> iterator = al1.iterator();
        while(iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        System.out.println(iterator.next());

    }
}
