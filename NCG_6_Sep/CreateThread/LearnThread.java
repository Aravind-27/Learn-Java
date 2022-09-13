package NCG_6_Sep.CreateThread;

public class LearnThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Doing heavy processing - START "+Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
            doETLProcessing();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Doing heavy processing - END "+Thread.currentThread().getName());
    }

    private void doETLProcessing() throws InterruptedException {
        Thread.sleep(5000);
    }
}
