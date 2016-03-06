import java.util.GregorianCalendar;
import java.util.Calendar;
public class DriverLicense extends IDcard{
int expirationYear;

public DriverLicense(String name, String id, int eY){
	super(name, id);
	expirationYear = eY;
}

public String format(){
	return super.format() + " expiration year: " + expirationYear;
}

public boolean isExpired(){
	boolean isExpired = true;
	GregorianCalendar calendar = new GregorianCalendar();
	if(expirationYear > calendar.get(Calendar.YEAR)){
		isExpired = false;
	}
	else if(expirationYear <= calendar.get(Calendar.YEAR)){
		isExpired = true;
	}
	return isExpired;
	
}

public int getExpYear(){
	return expirationYear;
}

}
