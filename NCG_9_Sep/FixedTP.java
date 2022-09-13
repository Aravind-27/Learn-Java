package NCG_9_Sep;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThread implements Runnable {
    private String msg;

    public MyThread(String msg) {
        this.msg = msg;
    }

    public void run() {
        System.out.println(" Starting :" + Thread.currentThread().getName());
        System.out.println("Thread Msg : " + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        System.out.println(" Ending :" + Thread.currentThread().getName());
    }
}

public class FixedTP {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        for (int number = 0; number < 4; number++) {
            Runnable worker = new MyThread("Thread " + number);
            executor.execute(worker);
        }
        executor.shutdown();
        while (!executor.isTerminated());
        System.out.println("All threads finished");
    }
}