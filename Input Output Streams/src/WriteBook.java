// WriteBook.java
import java.io.*;
public class WriteBook {

	public static void main(String[] args) {
		Book b = new Book("Gone With the Wind", "Margaret Mitchell", 1996, 1037);
		try {
			FileOutputStream fout = new FileOutputStream("Book.dat");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(b);
			out.close();
		} catch (IOException e) { 
			System.err.println(e.getMessage());
		}
	}
}
