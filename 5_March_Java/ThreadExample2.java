public class ThreadExample2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is Starting " + Thread.currentThread().getName());

    }

    public static void main(String[] args) {
        ThreadExample2 obj = new ThreadExample2();
        Thread objThread = new Thread(obj);
        objThread.setName("Driving");
        objThread.start();

        Thread obj2 = new Thread(new ThreadExample2());
        obj2.setName("music");
        obj2.start();

    }
}
