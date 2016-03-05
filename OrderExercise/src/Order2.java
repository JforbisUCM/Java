import java.io.*;
@SuppressWarnings("serial")
public class Order2 implements Serializable {
	private int customerId;
	private String name;
	
	public Order2(String n, int id){
		name = n;
		customerId = id;
	}
	
	public void writeText(String filename){
		try{
			FileWriter foutput = new FileWriter( filename );
			PrintWriter pout = new PrintWriter( foutput );
			pout.print("ID: " + customerId);
			pout.print("Name: " + name);
			pout.close();
		}
		catch(IOException e){
			System.err.println("Error.");
		}
		
	
	}
	public void writeBinary(String filename){
		try{
			FileOutputStream foutput = new FileOutputStream( filename );
			DataOutputStream doutput = new DataOutputStream( foutput );
			
			try{
				doutput.writeInt( customerId );
				doutput.writeUTF( name );
			}catch(IOException e){
				System.err.println("Error writing.");
			}
			doutput.close();
		}catch(IOException e){
			System.err.println("Error opening.");
			
		}
	}
	public void writeObj(String filename){
		try{
			FileOutputStream fout = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(fout);
			
			out.writeObject(this);
			out.close();
			
		}catch(IOException e){
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

