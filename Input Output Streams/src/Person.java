// Person.java
import java.io.*;
public class Person {
	private String name;
	private String color;
	private int age;

	public Person(String n, String c, int a) {
		name = n;
		color = c;
		age = a;
	}

	public String toString() {
		return name + " is " + age + " and likes " + color + ".";
	}

	public static void main(String[] args) {
		String name = null;
		String color = null;
		int age = 0;

		try {
			InputStreamReader conv = new InputStreamReader(System.in);
			BufferedReader buf = new BufferedReader(conv);

			System.out.print("What is your first name? ");
			name = buf.readLine();
			System.out.print("How old are you, " + name + "? ");
			age = Integer.parseInt(buf.readLine());
			System.out.print("And what is your favorite color? ");
			color = buf.readLine();
			buf.close();
		} catch (Exception e) { System.err.println(e.getMessage()); }

		Person you = new Person(name, color, age);
		System.out.println(you);

	}
}
