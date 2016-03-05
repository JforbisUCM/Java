// Book.java
import java.io.*;
@SuppressWarnings("serial")
public class Book implements Serializable {
	private String title;
	private String author;
	private int yearPublished;
	private int numPages;

	public Book(String t, String a, int y, int n) {
		title = t;
		author = a;
		yearPublished = y;
		numPages = n;
	}

	public String toString() {
		return "\"" + title + "\" by " + author + ", published " +
			yearPublished + ", " + numPages + " pages.";
	}
	public int getYear(){ return yearPublished;}

}
