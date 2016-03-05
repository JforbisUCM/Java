import java.io.*; //DataIOTest.java
class DataIOTest {
    public static void main(String[] args) {
          try { // writing part
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("invoice1.dat"));
            double[] prices = { 19.99, 9.99, 15.99, 3.99, 4.99 };
            int[] units = { 12, 8, 13, 29, 50 };
            String[] descs = { "Java T-shirt", "Java Mug", "Duke Juggling Dolls", "Java Pin", "Java Key Chain" };
            for (int i = 0; i < prices.length; i ++) {
                dos.writeDouble(prices[i]);
                dos.writeChar('\t');
                dos.writeInt(units[i]);
                dos.writeChar('\t');
                dos.writeChars(descs[i]);
                dos.writeChar('\n');       }
            dos.close();
        } catch (IOException e) {
            System.err.println("DataIOTest: " + e);  }
         try {// reading part
            DataInputStream dis = new DataInputStream(new FileInputStream("invoice1.dat"));
	    PrintWriter stdout = new PrintWriter(System.out, true);
            double price;    int unit;  double total = 0.0;  char chr;
          try {
                while (true) {
                    price = dis.readDouble();
                    dis.readChar();       // throws out the tab
                    unit = dis.readInt();
		    StringBuffer desc = new StringBuffer(20);
		    while ((chr = dis.readChar()) != '\n')
			    desc.append(chr);
                    stdout.println("You've ordered " + unit + " units of " + desc + " at $" + price);
                    total = total + unit * price;
                }
            } catch (EOFException e) {
            }
            stdout.println("For a TOTAL of: $" + total);
            dis.close();
        } catch (FileNotFoundException e) {
            System.err.println("DataIOTest: " + e);
        } catch (IOException e) {
            System.err.println("DataIOTest: " + e);        }
    }
}
