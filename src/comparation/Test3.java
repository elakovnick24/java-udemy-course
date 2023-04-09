package comparation;

import java.util.*;

public class Test3 {
    public static void main(String[] args) {
        List<Person2> peopleList = new ArrayList<>();
        Set<Person2> peopleSet = new TreeSet<>();

        addElements(peopleList);
        addElements(peopleSet);

        Collections.sort(peopleList);
    }

    private static void addElements(Collection collection) {
        collection.add(new Person2(3, "Katy"));
        collection.add(new Person2(4, "George"));
        collection.add(new Person2(1, "Bob"));
        collection.add(new Person2(2, "Tom"));
    }
}

class Person2 implements Comparable<Person2>{
    private int id;
    private String name;

    public Person2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person2 person = (Person2) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person2 o) {
        if (this.id > o.getId()) {
            return 1;
        } else if (this.id < o.getId()) {
            return -1;
        } else {
            return 0;
        }
    }

/*    @Override
    public int compareTo(Person2 o) {
        if (this.name.length() > o.getId()) {
            return 1;
        } else if (this.name.length() < o.getId()) {
            return -1;
        } else {
            return 0;
        }
    }*/
}
