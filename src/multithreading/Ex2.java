package multithreading;

public class Ex2 extends Thread {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Thread 1 " + i);
        }
    }

    public static void main(String[] args) {
        Ex2 thread1 = new Ex2();
        thread1.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("Thread 1 " + i);
        }
    }


//        MyThread1 myThread1 = new MyThread1();
//        MyThread1 myThread2 = new MyThread1();
//        MyThread2 myThread2 = new MyThread2();
//        myThread1.start();
//        myThread2.start();
}


//class MyThread1 extends Thread {
//    public void run() {
//        for (int i = 0; i < 1000; i++) {
//            System.out.println("Thread 1 " + i);
//        }
//    }
//}
//
//class MyThread2 extends Thread {
//    public void run() {
//        for (int i = 0; i < 1000; i++) {
//            System.out.println("Thread 2 " +i);
//        }
//    }
//}