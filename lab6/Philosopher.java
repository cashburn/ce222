import java.util.Scanner;

public class Philosopher extends Thread{

  private Object leftFork, rightFork;
  private int myNumber;

  public Philosopher(Object left, Object right, int number){
    leftFork = left;
    rightFork = right;
    myNumber = number;
  }

  public void run(){
    int timesDined = 0;
    while(true){
        if (myNumber == 0) {
          synchronized(rightFork){
            synchronized(leftFork){
                try {
                this.sleep(10);
                } catch(InterruptedException e) {
                    e.printStackTrace();
                }
                
              timesDined++;
            }
          }
        }
        else {    
      synchronized(leftFork){
        synchronized(rightFork){
                try {
                this.sleep(10);
                } catch(InterruptedException e) {
                    e.printStackTrace();
                }
          timesDined++;
        }
      }
        }
      if(timesDined % 100 == 0)
        System.out.println(myNumber + " - " + timesDined + " - " + this.getPriority());
      if (timesDined == 2500000)
          this.stop();
    }
  }

  public static void main(String[] args){
    final int PHILOSOPHERS = 6;
    Object[] forks = new Object[PHILOSOPHERS];
    for(int i = 0; i < PHILOSOPHERS; i++){
      forks[i] = new Object();
    }
    for(int i = 0; i < PHILOSOPHERS; i++){
      int next = (i+1) % PHILOSOPHERS;
      Philosopher p = new Philosopher(forks[i], forks[next], i);
      p.start();
      if (i == 5)
          p.setPriority(1);
    }
    Scanner s = new Scanner(System.in);
    s.nextLine();
    s.close();
  }
}
