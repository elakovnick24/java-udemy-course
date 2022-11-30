package collection.map_interface;

import java.util.HashMap;
import java.util.Map;

public class HashCodeEx1 {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap();
        Student st1 = new Student("Zaur" , "Tregulov" , 3);
        Student st2 = new Student("Mariya" , "Ivanova" , 6);
        Student st3 = new Student("Sergey" , "Petrov" , 4);
        map.put(st1, 7.5);
        map.put(st2, 8.7);
        map.put(st3, 9.3);
        System.out.println(map) ;

        Student st4 = new Student("Zaur" , "Tregulov" , 3);
        boolean result = map.containsKey(st4);
        System.out.println("result =" + result);
    }
}

class Student {
    String name;
    String surname;
    int course;
    
    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((surname == null) ? 0 : surname.hashCode());
        result = prime * result + course;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (surname == null) {
            if (other.surname != null)
                return false;
        } else if (!surname.equals(other.surname))
            return false;
        if (course != other.course)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", surname=" + surname + ", course=" + course + "]";
    }

    
}
