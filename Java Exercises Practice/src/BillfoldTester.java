
public class BillfoldTester {
public static void main(String[] args){
	DriverLicense d = new DriverLicense("John Smith", "158643", 2014);
	CallingCard c = new CallingCard("Oyster card", "455648", 1530);

	BillFold b = new BillFold();
	
	b.addCard(d);
	b.addCard(c);
	
	System.out.println(b.formatCards());
	System.out.println("Expected: [Name: John Smith, Expiration Year: 2014 " + " Name: Oyster Card, Card Number: 455648, Pin 1530]");
	System.out.println("Number of expired cards: " + b.getExpiredCount());
	System.out.println("Expected: 1");
	}


}
