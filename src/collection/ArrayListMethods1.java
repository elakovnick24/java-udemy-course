package collection;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<String> al1 = new ArrayList<String>();
        al1.add("Zaur");
        al1.add("Ivan");
        al1.add("Mariya");
        al1.add(1, "Misha");
        for (String s: al1) {
            System.out.println(s + " ");
        }
        System.out.println(al1.get(2));
        al1.set(1, "Masha");
        al1.remove(0);
    }
}
