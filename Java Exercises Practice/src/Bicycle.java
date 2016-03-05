
public class Bicycle extends Vehicle{

private int gears;	

//default constructor, calls argument constructor and passes parameters
public Bicycle(){
	this(2,30);
}
	
//argument constructor, takes input for parameters calls super constructor from parent class	
public Bicycle(int pGears, int pSpeed){
super(2,pSpeed);	
gears = pGears;

}

public void setGears(int pGears){
	gears = pGears;
}

public int getGears(){
	return gears;
}
	

public String toString(){
	return super.toString() + ", number of gears" + gears;
}
}






