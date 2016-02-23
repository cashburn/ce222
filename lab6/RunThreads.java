public class RunThreads {
    public static void main(String[] args) {
        X th_x = new X();
        Y th_y = new Y();
        th_x.start();
        th_y.start();
        System.out.println("\n" + " Main Thread Exiting ....");
    }
}

class X extends Thread {
    public void run() {
        for (int x = 10; x < 15; x++) {
            System.out.println("\n\tThread X : x = " + x);
        }
    }
}

class Y extends Thread {
    public void run() {
        for (int y = 100; y > 90; y--) {
            System.out.println("\nThread Y : y = " + y);
        }
    }
}