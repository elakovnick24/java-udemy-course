package collection;

import java.util.ArrayList;

public class ArrayListMethods3 {
    public static void main(String[] args) {
        ArrayList<String> al1 = new ArrayList<>();
        al1.add("Zaur");
        al1.add("Ivan");
        al1.add("Mariya");
        al1.add("Ivan");
        System.out.println(al1);

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("!!!");
        al2.add("???");
        al1.addAll(1, al2);
        System.out.println(al1);

        al1.clear();
        System.out.println(al1);

        System.out.println(al1.indexOf("Ivan"));
        System.out.println(al1.lastIndexOf("Ivan"));
        System.out.println(al1.size());
        System.out.println(al1.isEmpty());
        System.out.println(al1.contains("Mariya"));


    }
}
