package NCG_9_Sep;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Tasks implements Runnable {
    private String name;

    public Tasks(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("Start executing " + name);
        try {
            Thread.sleep(1000);
            System.out.println("Executing " + name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finished execution " + name);
        System.out.println();
    }
}

public class CachedTP {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        for (int number = 0; number < 4; number++) {
            Runnable worker = new Tasks("Tasks " + number);
            executor.execute(worker);
        }
        executor.shutdown();
        while (!executor.isTerminated()) ;
        System.out.println("All threads finished");
    }
}