package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String> al1 = new ArrayList<String>();
        al1.add("Zaur");
        al1.add("Ivan");
        al1.add("Mariya");
        System.out.println(al1);

        ArrayList<String> al2 = new ArrayList<>(200);
        al2.add("Zaur");
        al2.add("Ivan");
        List<String> al3 = new ArrayList<>();

        ArrayList<String> al4 = new ArrayList<>(al1);
        System.out.println(al4);
        System.out.println(al1 == al4);

    }
}
