package multithreading;

public class Ex3 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Thread 1 " + i);
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Ex3());
        thread1.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("Thread 1 " + i);
        }
//        Thread thread1 = new Thread(new MyThread3());
//        Thread thread2 = new Thread(new MyThread4());
//        thread1.start();
//        thread2.start();
    }


}

//class MyThread3 implements Runnable {
//    public void run() {
//        for (int i = 0; i < 1000; i++) {
//            System.out.println("Thread 1 " + i);
//        }
//    }
//}
//
//class MyThread4 implements Runnable {
//    public void run() {
//        for (int i = 0; i < 1000; i++) {
//            System.out.println("Thread 2 " +i);
//        }
//    }
//}