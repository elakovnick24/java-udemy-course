package multithreading;

import java.util.concurrent.Semaphore;

public class SemaphoreEx {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);
        new Person("Nick", callBox);
        new Person("Mike", callBox);
        new Person("John", callBox);
        new Person("June", callBox);
        new Person("Katie", callBox);
        new Person("Joe", callBox);

    }
}

class Person extends Thread {
    String name;
    private Semaphore callBox;

    public Person(String name, Semaphore callBox) {
        this.name = name;
        this.callBox = callBox;
        this.start();
    }

    public void run() {
        try {
            System.out.println(name + " waiting....");
            callBox.acquire();
            System.out.println(name + " using phone...");
            sleep(2000);
            System.out.println(name + " ends phone");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            callBox.release();
        }
    }
}