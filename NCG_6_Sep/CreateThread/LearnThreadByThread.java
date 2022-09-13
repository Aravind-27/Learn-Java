package NCG_6_Sep.CreateThread;

public class LearnThreadByThread extends Thread {
    public LearnThreadByThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("LearnThreadByThread - START "+Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
            //Get database connection, delete unused data from DB
            doETLProcessing();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("LearnThreadByThread - END "+Thread.currentThread().getName());
    }

    private void doETLProcessing() throws InterruptedException {
        Thread.sleep(5000);
    }
}
