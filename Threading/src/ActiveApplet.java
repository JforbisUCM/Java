// ActiveApplet.java
import java.applet.Applet;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class ActiveApplet extends Applet implements Runnable {
  private Thread theThread=null;
  private int i;
  public void start() {
    i = 0;
    theThread = new Thread(this);
    theThread.start();
  }
  public void paint(Graphics g) {
    g.drawString("    " + i + "    ", 20, 20);
  }
  public void stop() {
    theThread = null;
  }
  public void run() {
    for (int n=0; n<100; n++) {
      repaint();
      i++;
      try { Thread.sleep(500); }
      catch (InterruptedException ie) { System.exit(1); }
    }
  }
}