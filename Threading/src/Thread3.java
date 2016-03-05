// Thread1.java
//import java.awt.Graphics;
public class Thread3 {
  public static void main(String[] args) {
    PrintNumbers4 p1 = new PrintNumbers4( 1, 2 );
    PrintNumbers4 p2 = new PrintNumbers4( 2, 2 );
    Thread t1 = new Thread(p1);
    Thread t2 = new Thread(p2);
    t1.start();
    t2.start();
  }
}

class PrintNumbers4 implements Runnable {
  private int start=0;
  private int increment=1;
  public PrintNumbers4(int st, int inc) {
    start = st;
    increment = inc;
  }
  public void print() {
    int i, j;
    for (i=start, j=0; j<20; j++, i+=increment) {
      System.out.println(i);
      try {Thread.sleep(50);}
      catch (Exception e){}
      }
  }
  public void run() {
    print();
  }
}