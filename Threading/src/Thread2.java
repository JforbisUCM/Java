// Thread2.java
public class Thread2 {
  public static void main(String[] args) {
    PrintNumbers3 p1 = new PrintNumbers3( 1, 2 );
    PrintNumbers3 p2 = new PrintNumbers3( 2, 2 );
    p1.start();
    p2.start();
  }
}

class PrintNumbers3 extends Thread {
  private int start=0;
  private int increment=1;
  public PrintNumbers3(int st, int inc) {
    start = st;
    increment = inc;
  }
  public void print() {
    int i, j;
    for (i=start, j=0; j<20; j++, i+=increment) {
      System.out.println(i);
      yield();
    }
  }
  public void run() {
    print();
  }
}