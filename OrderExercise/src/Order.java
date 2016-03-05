// Order.java
import java.io.*;

@SuppressWarnings("serial")
public class Order implements Serializable {
  private int cust_id;
  private String name;

  public Order(int id, String n) {
    cust_id = id;
    name = n;
  }

  public void writeText(String filename) {
    try{
      FileWriter foutput = new FileWriter( filename );
      PrintWriter pout= new PrintWriter( foutput );
      // save the object
      pout.print("ID: ");
      pout.println( cust_id );
      pout.print("Name: ");
      pout.print( name );
      pout.close();
    } catch (IOException e) { 
      System.err.println("error opening file");
    }
  }

  public void writeBinary(String filename) {
    try{
      FileOutputStream foutput = new FileOutputStream( filename );
      DataOutputStream doutput = new DataOutputStream( foutput );
      try{
        doutput.writeInt( cust_id );
        doutput.writeUTF( name );
      }catch(IOException e){ 
        System.err.println("error writing to file"); 
      }
      doutput.close();
    } catch (IOException e) { 
      System.err.println("error opening file");
    }
  }

  public void writeObj(String filename) {
    try {
      FileOutputStream fout = new FileOutputStream(filename);
      ObjectOutputStream out = new ObjectOutputStream(fout);
      out.writeObject(this);
      out.close();
    } catch (IOException e) { 
      System.err.println(e.getMessage());
    }
  }

  public static void main(String[] args) {
    Order o = new Order(23, "Bob Dobbs");
    o.writeText("order.txt");
    o.writeBinary("order.dat");
    o.writeObj("order.obj");
  }

}
