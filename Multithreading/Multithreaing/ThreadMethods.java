package Multithreaing;

public class ThreadMethods extends Thread {
    @Override
    public void run() {
        // for (int i = 0; i <= 5; i++) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {

            throw new RuntimeException(e);
        }

    }

    // }

    public static void main(String[] args) throws InterruptedException {
        ThreadMethods t1 = new ThreadMethods();
        t1.start(); // output -> Printing of 1 to 5 with gap of 1 seconds
        t1.join(); // it will print hello after 5 seconds
        System.out.println("Hello");

    }

}
// Methods:-

// start , join , run , sleep , setPriority , interrupt , yield , setDaemon
// The threads which are running in background are called Daemon threads , fot
// which JVm don't wait