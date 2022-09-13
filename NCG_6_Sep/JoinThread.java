package NCG_6_Sep;

public class JoinThread {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable(), "t1");
        Thread t2 = new Thread(new MyRunnable(), "t2");
        Thread t3 = new Thread(new MyRunnable(), "t3");

        t1.start();
        try {
            t1.join(2000);
      System.out.println("T1 after2 secs");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();
        try {
            t1.join();
            System.out.println("T1 join  after T2 starts");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t3.start();
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("All threads are dead, exiting main thread");
    }

}

class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread started:::"+Thread.currentThread().getName());
        try {
            Thread.sleep(4000);
            System.out.println(Thread.currentThread().getName()+" sleeping");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread ended:::"+Thread.currentThread().getName());
    }

    }

