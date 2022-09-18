package generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//        list.add("OK");
//        list.add(5);
//        list.add(new StringBuilder("abcd"));
//        list.add(new Car());
        list.add("Hi");
        list.add("Bye");
        list.add("Ok");
        list.add("abcdefg");

        for (Object o : list
        ) {
            System.out.println(o + " lenght " + ((String)o).length());
        }
    }
}

class Car {
}