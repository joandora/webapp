package co.otipc.executor;

/**
 * Created by cuichaoguo on 16/2/27.
 */
public class MyThread implements Runnable {
  private int count = 1, number;

  public MyThread(int num) {
    number = num;
    System.out.println("Create Thread-" + number);
  }

  public void run() {
    while (true) {
      System.out.println("Thread-" + number + " run " + count + " time(s)");
      if (++count == 3) {
        return;
      }
    }
  }
}
