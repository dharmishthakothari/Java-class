class ThreadEven extends Thread {
    public void run() {
        for (int i = 0; i < 100; i += 2) {
            System.out.println("Even " + i);
        }
    }
}

class ThreadOdd extends Thread {
    public void run() {
        for (int i = 1; i < 100; i += 2) {
            System.out.println("Odd " + i);
        }
    }
}

public class ThreadExample3 {
    public static void main(String[] args) {
        ThreadEven even = new ThreadEven();
        even.start();

        ThreadOdd odd = new ThreadOdd();
        odd.start();
    }
}
