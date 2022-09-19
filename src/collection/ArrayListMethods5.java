package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods5 {
    public static void main(String[] args) {
        ArrayList<String> al1 = new ArrayList<>();
        al1.add("Zaur");
        al1.add("Ivan");
        al1.add("Mariya");
        al1.add("Kolya");
        al1.add("Elena");
        System.out.println(al1);

        ArrayList<String> al2 = new ArrayList<>();
        al1.add("Ivan");
        al1.add("Mariya");
        al1.add("Igor");

        al1.removeAll(al2);
        System.out.println(al1);
        al1.retainAll(al2);
        System.out.println(al1);

        boolean result = al1.containsAll(al2);
        System.out.println(result);

        //sublist - view al1
        List<String> myList = al1.subList(1, 4);
        System.out.println(myList);
        myList.add("fedor");
        System.out.println("Sub list = " + myList);
        System.out.println("Arraylist = " + al1);
        al1.add("Sveta");
        System.out.println("Arraylist = " + al1);
        // Will be exception Concurrent modification
        System.out.println("Sub list = " + myList);

        Object[] array = al1.toArray();
        String[] array2 = al1.toArray(new String[0]);
        for (String s: array2) {
            System.out.println(s);
        }

        // Can't contain null !!!
        List<Integer> list1 = List.of(3, 8, 13, null);
        System.out.println(list1);

        List<String> list2 = List.copyOf(al1);
        System.out.println(list2);
    }
}
