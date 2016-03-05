import java.io.*;
public class Order implements Serializable {
	private int customerID;
	private String name;

	public Order(int ID, String n){
		customerID = ID;
		name = n;
	}

	public void writeText(){
		try{
			DataOutputStream ord = new DataOutputStream(new FileOutputStream("Order.txt"));
		}
		catch(IOException e){
			System.err.println("Oder: "+e);
		}
	}
	/*public void writeText(Writer out) {
		PrintWriter printOut = new PrintWriter(out);
		printOut.println(customerID);
		printOut.println(name);
		
	}*/
	
}
