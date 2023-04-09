package multithreading;

import java.util.concurrent.*;

public class CallableFactorial {
    static int factrialResult;
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial2 factorial2 = new Factorial2(5);
        Future<Integer> future = executorService.submit(factorial2);
        try {
            factrialResult = future.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            System.out.println(e.getCause());
        } finally {
            executorService.shutdown();
        }
    }
}

class Factorial2 implements Callable<Integer> {

    int f;
    public Factorial2(int f) {
        this.f = f;
    }
    @Override
    public Integer call() throws Exception {
        if (f < 0) {
            throw new Exception("You inputed wrong number");
        }

        int result = 1;
        for (int i = 0; i <= f; i++) {
            result *= i;
        }
        return result;
    }
}