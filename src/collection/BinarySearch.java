package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(-3);
        al1.add(8);
        al1.add(12);
        al1.add(-8);
        al1.add(0);
        al1.add(5);
        al1.add(10);
        al1.add(1);
        al1.add(150);
        al1.add(-30);
        al1.add(19);
        Collections.sort(al1);
        System.out.println(al1);
        Collections.reverse(al1);
        System.out.println(al1);
        Collections.shuffle(al1);
        System.out.println(al1);
        int index1 = Collections.binarySearch(al1, 12);
        System.out.println(index1);

        ///////////////////////////////////////////////////
        Employee emp1 = new Employee(100, "Nick", 123456);
        Employee emp2 = new Employee(15, "Ivan", 6542);
        Employee emp3 = new Employee(123, "Petr", 8542);
        Employee emp4 = new Employee(15, "Mariya", 5678);
        Employee emp5 = new Employee(182, "Kolya", 125);
        Employee emp6 = new Employee(15, "Sasha", 9874);
        Employee emp7 = new Employee(250, "Elena", 1579);
        List<Employee> empList = new ArrayList<>();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);
        empList.add(emp6);
        empList.add(emp7);
        System.out.println(empList);
        Collections.sort(empList);
        System.out.println(empList);
        int index2 = Collections.binarySearch(empList,
                new Employee(182, "Kolya", 125));
        System.out.println(index2);
        //////////////////////////////////////////////////////////////////////////////////////////////////
        int[] arr = {-3, 8, 12, -8, -3, 5, 10, 1, 150, -30, 90};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int index3 = Arrays.binarySearch(arr, 150);
        System.out.println(index3);

    }
}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmp) {
        int result = this.id - anotherEmp.id;
        if (result == 0) {
            result = this.name.compareTo(anotherEmp.name);
        }
        return result;
    }
}