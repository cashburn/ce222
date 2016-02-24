import java.util.Scanner;

public class ManyThreads extends Thread{

  private Object leftFork, rightFork;
  private int myNumber;

  public ManyThreads(int number){
    myNumber = number;
  }

  public void run(){
    int timesDined = 0;
    while(true){
        timesDined++;
      if(timesDined % 10000000 == 0)
        System.out.println(myNumber + " - " + timesDined + " - " + this.getPriority());
      if (timesDined == 250000000)
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
      ManyThreads p = new ManyThreads(i);
      p.start();
      if (i == 5)
          p.setPriority(9);
      /*try {
          sleep(2000);
      } catch (InterruptedException e) {
          e.printStackTrace();
      }*/
    }
    Scanner s = new Scanner(System.in);
    s.nextLine();
    s.close();
  }
}
