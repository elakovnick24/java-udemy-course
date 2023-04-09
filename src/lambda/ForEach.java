package lambda;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> list  = List.of("String", "String2", "String3");
        list.forEach(str -> System.out.println(str));

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list.forEach(el-> {
            System.out.println(el);
            el += 2;
            System.out.println(el);
        });
    }
}
