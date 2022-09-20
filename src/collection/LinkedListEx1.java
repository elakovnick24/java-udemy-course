package collection;

import java.util.LinkedList;

public class LinkedListEx1 {
    public static void main(String[] args) {
        Student2 st1 = new Student2("Ivan", 3);
        Student2 st2 = new Student2("Nikolay", 2);
        Student2 st3 = new Student2("Elena", 1);
        Student2 st4 = new Student2("Petr", 1);
        Student2 st5 = new Student2("Mariya", 3);

        LinkedList<Student2> ll1 = new LinkedList<>();
        ll1.add(st1);
        ll1.add(st2);
        ll1.add(st3);
        ll1.add(st4);
        ll1.add(st5);
        System.out.println("Linked List = " + ll1);
        System.out.println(ll1.get(2));
        Student2 st6 = new Student2("Nick", 3);
        Student2 st7 = new Student2("Igor", 4);
        ll1.add(st6);
        System.out.println("Linked List = " + ll1);
    }
}

class Student2 {
    String name;
    int course;

    public Student2(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}