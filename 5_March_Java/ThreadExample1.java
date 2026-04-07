public class ThreadExample1 extends Thread {
    public void run() {

        // System.out.println("Thread is Running " + Thread.currentThread().getName());
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName());
        }

    }

    public static void main(String[] args) throws InterruptedException {
        ThreadExample1 obj = new ThreadExample1();
        obj.setName("Driving");
        obj.start();
        // obj.join();
        Thread.sleep(100);
        ThreadExample1 obj1 = new ThreadExample1();

        obj1.setName("Music");
        obj1.start();
        // obj1.join();

        // System.out.println(obj.isAlive());
    }
}
