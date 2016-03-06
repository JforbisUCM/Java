 
public class CallingCard extends Card {
private String cardNumber;
private int pin;

public CallingCard(String name, String cN, int pin){
	super(name);
	cardNumber = cN;
	this.pin = pin;
}

public String format(){
	return super.format() + " Card Number: " + cardNumber + " pin: " + pin;
}

public String getCardNumber(){
	return cardNumber;
}
}
