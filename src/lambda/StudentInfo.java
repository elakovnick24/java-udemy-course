package lambda;

import java.util.ArrayList;

public class StudentInfo {

    void testStudents(ArrayList<Student> a1, StudentsCheck s c) {
        for (Student student : a1) {
            if(sc.check(student)) {
                System.out.println(student);
            }
        }
    }
}

    // void printsStudentsOverGrade(ArrayList<Student> a1, double grade) {
    // for (Student student : a1) {
    // if(student.avgGrade > grade) {
    // System.out.println(student);
    // }
    // }
    // }

    // void printStudentsUnderAge(ArrayList<Student> a1, int age) {
    // for (Student student : a1) {
    // if(student.age > age) {
    // System.out.println(student);
    // }
    // }
    // }

    // void printStudentsMixCondition(ArrayList<Student> a1, int age, double grade,
    // char sex) {
    // for (Student student : a1) {
    // if(student.age > age && student.avgGrade < grade && student.sex ==sex) {
    // System.out.println(student);
    // }
    // }
    // }

    class Test {
        public static void main(String[] args) {
            Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
            Student st2 = new Student("Elena", 'f', 28, 5, 6.4);
            Student st3 = new Student("Nikolay", 'm', 23, 3, 4.3);
            Student st4 = new Student("Petr", 'm', 35, 4, 7);
            Student st5 = new Student("Mariya", 'm', 23, 3, 9.1);
            ArrayList<Student> students = new ArrayList<>();
            students.add(st1);
            students.add(st2);
            students.add(st3);
            students.add(st4);
            students.add(st5);

            StudentInfo info = new StudentInfo();
            // info.testStudents(students, new CheckOverGrade());
            System.out.println("-----------------------------------------");
            // info.testStudents(students, new StudentsCheck() {
            // @Override
            // public boolean check(Student s) {
            // return s.age < 30;
            // }
            // });
            info.testStudents(students, (Student s) -> {
                return s.age < 30;
            });
            System.out.println("-----------------------------------------");
            info.testStudents(students, (Student s) -> {
                return s.avgGrade > 8;
            });
            System.out.println("-----------------------------------------");
            info.testStudents(students, (Student s) -> {
                return s.age > 20 && s.avgGrade < 9.3 && s.sex == 'f';
            });
            // The best way
            info.testStudents(students, s -> s.avgGrade > 8);
            // info.printsStudentsOverGrade(students, 8);
            // System.out.println("-----------------------------------------");
            // info.printStudentsUnderAge(students, 30);
            // System.out.println("-----------------------------------------");
            // info.printStudentsMixCondition(students, 7, 30, 'm');
        }
    }

    interface StudentsCheck {
        boolean check(Student s);
    }

class CheckOverGrade implements StudentsCheck {

    @Override
    public boolean check(Student s) {
        return s.avgGrade > 8;
    }

}
