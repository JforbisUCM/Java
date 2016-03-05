
class Employee extends Person implements Fireable{
	private String title;
	private float salary;
	public Employee()
	{	title = "Clerk";
		salary = 20000;
	}

public String getTitle()  { return title; } 
public float getSalary() { return salary; }
public String getName() {
	 if (title.equals("Doctor")) 
		return "Dr. " + super.getName(); 
		return super.getName();
	}

public float fire(){
	System.out.println("Goodbye : (");
	return salary/26;
}
}
