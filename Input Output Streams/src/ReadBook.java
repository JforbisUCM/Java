// ReadBook.java
import java.io.*;
public class ReadBook {

	public static void main(String[] args) {
		Object o = null;
		try {
			FileInputStream fout = new FileInputStream("Book.dat");
			ObjectInputStream in = new ObjectInputStream(fout);
			try {
				o = in.readObject();
			} catch (ClassNotFoundException e) {
				System.err.println(e.getMessage());
			}
			in.close();
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		System.out.println(o);
	   System.out.println("Year Published = " + ((Book)o).getYear());
	}
}
