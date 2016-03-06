
public class Vehicle {
private int wheels;
private int speed;

public Vehicle(){
	wheels = 4;
	speed = 35;
}

public Vehicle(int pWheels, int pSpeed){
	wheels = pWheels;
	speed = pSpeed;
}

public void setSpeed(int pSpeed){
	speed = pSpeed;
}

public void setWheels(int pWheels){
	wheels = pWheels;
}

public int getWheels(){
	return wheels;
}

public int getSpeed(){
	return speed;
}

public String toString(){
	
	return wheels + " wheels, " +  speed + "mph max speed";
}



}
