import java.io.*;
public class Reader extends Thread{
private int id;
private BufferedReader input;

public Reader(int number,String filename){
	id = number;
	try{
		input = new BufferedReader(new FileReader(filename));
	}
	catch(IOException e){
		System.err.println(e.getMessage());
		System.exit(-1);
	}
	

}
	
	
	public void run(){
	String line = null;
	int count = 0;
	try{
	while((line = input.readLine()) !=null){
			System.out.println("Object " + id + " " + line);
			if ((++count % 5) == 0)
				yield();
		}
	}
	catch(IOException e){
		System.err.println(e.getMessage());
		System.exit(-1);
	}
  }
}
