
public class DogTester {
	public static void main (String args[])
	{
		
		Dog frodo = new Dog("black",2,2.0);
		Dog fido = new Dog("yellow",3,1.5);
		Dog rex = new Dog("black",2,2.0);
		
		System.out.println("frodo and fido are equal: " + frodo.equals(fido));
		System.out.println("frodo and rex are equal: " + frodo.equals(rex));
	}
}
