
public class ObjectArray {

public static void main(String[] args){
Object[] VehicleArray = new Object[3];
	
	VehicleArray[0] = new Bicycle(10, 30);
	VehicleArray[1] = new Bicycle(3, 15);
	VehicleArray[2] = new Vehicle();
	
	System.out.println("Vehicles: ");
	
	for(int i = 0; i<VehicleArray.length; i++){
		System.out.println(VehicleArray[i]);
	}
		





	}
}