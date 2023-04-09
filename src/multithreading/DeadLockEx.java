package multithreading;

public class DeadLockEx {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread10 thread10 = new Thread10();
        Thread20 thread20 = new Thread20();
        thread20.start();
        thread10.start();
    }
}

class Thread10 extends Thread {
    public void run() {
        System.out.println("Thread10: Attempt to capture object's lock1 monitor ");
        synchronized (DeadLockEx.lock1) {
            System.out.println("Thread10: Attempt lock1");
            System.out.println("Thread10: Attempt to capture object's lock2 monitor");
            synchronized (DeadLockEx.lock2) {
                System.out.println("Thread10: Capture monitors objects");
            }
        }
    }
}

class Thread20 extends Thread {
    public void run() {
        System.out.println("Thread20: Attempt to capture object's lock2 monitor");
        synchronized (DeadLockEx.lock2) {
            System.out.println("Thread20: Capture lock2");
            System.out.println("Thread20: Attempt to capture object's lock1 monitor");
            synchronized (DeadLockEx.lock1) {
                System.out.println("Thread20: Capture monitors objects");
            }
        }
    }
}