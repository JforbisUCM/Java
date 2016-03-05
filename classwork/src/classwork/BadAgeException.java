package classwork;

@SuppressWarnings("serial")
public class BadAgeException extends Exception{
	int age;
	public BadAgeException(int age){
		this.age = age;
	}
	public String getMessage(){
	return "You entered a bad age: " + age;
	}
	

}
