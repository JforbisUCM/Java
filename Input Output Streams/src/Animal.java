// Animal.java
import java.io.*;
public class Animal {
	private String species;
	private String name;
	private boolean friendly;
	private int weight;

	public Animal(String s, String n, boolean f, int w) {
		species = s;
		name = n;
		friendly = f;
		weight = w;
	}

	public void writeBinary(OutputStream out) {
		try {
			DataOutputStream dataOut = new DataOutputStream(out);
			dataOut.writeChars(species);
			dataOut.writeChars(name);
			dataOut.writeBoolean(friendly);
			dataOut.writeInt(weight);
		} catch (IOException e) { System.err.println(e.getMessage()); }
	}

	public void writeText(Writer out) {
		PrintWriter printOut = new PrintWriter(out);
		printOut.println(species);
		printOut.println(name);
		printOut.println(friendly);
		printOut.println(weight);
	}

	public static void main(String[] args) {
		Animal scrappy = new Animal("canine", "ScrappyJoe", true, 112);
		Animal hobbes = new Animal("tiger", "Hobbes", true, 425);
		Animal scar = new Animal("lion", "Scar", false, 600);

		try {
			FileOutputStream dat = new FileOutputStream("Animal.dat");
			scrappy.writeBinary(dat);
			hobbes.writeBinary(dat);
			scar.writeBinary(dat);
			dat.close();
		} catch (IOException e) { System.err.println(e.getMessage()); }

		try {
			FileWriter txt = new FileWriter("Animalia.txt");
			scrappy.writeText(txt);
			hobbes.writeText(txt);
			scar.writeText(txt);
			txt.close();
		} catch (IOException e) { System.err.println(e.getMessage()); }
	}
}
