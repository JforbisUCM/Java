// ReadIt.java
import java.io.*;
public class ReadIt {
	public static void main(String[] args) {
		String line;
		try { File f = new File("C:\\Users\\Forbis\\Downloads\\CH15\\CH15\\book.java");
			FileReader input = new FileReader(f);
			BufferedReader bufIn = new BufferedReader(input);

			// do buffered reading from a file
			// write each line to standard out
			while( (line = bufIn.readLine()) != null)
				System.out.println(line);

			bufIn.close();
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
}
