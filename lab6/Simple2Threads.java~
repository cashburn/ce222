import java.util.Scanner;
public class Simple2Threads {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        Thread childThread = new Thread(new Runnable(){
            public void run(){
                while (true) {
                    sleep(5000);
                    System.out.println("Child is done sleeping 5 seconds.");
                }
            }
        });
        childThread.start();
        s.nextLine();
        childThread.stop();
        System.out.println("Child process killed.");
    }
    private static void sleep(int milliseconds){
        try{
            Thread.sleep(milliseconds);
        } catch(InterruptedException e){
// ignore this exception; it won't happen anyhow
        }
    }
}