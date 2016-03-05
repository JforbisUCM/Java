
public class Person {
	private String lastname;
	private String firstname;
	private int age;
	public Person()
	{	lastname = "";
		firstname = "";
		age = 0;   	}	

public String getName() { return firstname + " " + lastname; } 
public int getAge() { return age; }

}
