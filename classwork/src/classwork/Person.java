package classwork;

public class Person {
private String name;
private int age;
public Person (String n, int age) throws InvalidDataException, BadNameException, BadAgeException{
	if (null == n || "".equals(n)){
		throw new InvalidDataException();
	}
	if("fred".equalsIgnoreCase(n))
		throw new BadNameException();
	name = n;
	if (age < 18)
		throw new BadAgeException(age);
}
	

public String toString(){
	return name + " is " + age + " years old.";
}
}
