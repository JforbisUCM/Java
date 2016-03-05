package classwork;
//UsePerson.java

public class UsePerson {
 public static void main(String[] args) {
     Person p = null;
     String name = null;
     // comment out next line to see exception!
     name = args[0];
     int age = Integer.parseInt(args[1]);
     try {
         p = new Person(name, age);
     }
     catch(InvalidDataException e) {
         System.err.println(e.getMessage());
     }
     catch(BadNameException e){
    	 System.err.println(e.getMessage());
     }
     catch(BadAgeException e){
    	 System.err.println(e.getMessage());
     }

     if (p != null)
         System.out.println("We got a Person created!");
 }
}