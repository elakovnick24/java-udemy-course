package generics;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
//        List<?> list = new ArrayList<String>();
//        list.add("hello");
        List<Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(3.15);
        list1.add(3.16);
        showListInfo(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("3.14");
        list2.add("3.15");
        list2.add("3.16");
        showListInfo(list2);
    }

    static void showListInfo(List<?> list) {
        System.out.println("My list contains next elements : " + list);
    }

}
