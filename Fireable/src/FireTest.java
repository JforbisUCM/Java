
public class FireTest {
static float totalPayoff = 0;
public static void fireThem(Fireable f){
	totalPayoff += f.fire();
}
public static void main(String[] args){
	Employee emp = new Employee();
	Ballplayer bp = new Ballplayer();
	fireThem(emp);
	fireThem(bp);
	 System.out.println("Total to fire everyone: " + totalPayoff);
}
}
