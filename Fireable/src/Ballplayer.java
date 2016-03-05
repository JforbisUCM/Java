
public class Ballplayer implements Fireable {
	private float contractAmount;
	private float amountReceived;
	public float fire(){
	System.out.println("Does anyone need a ball player?");
	return contractAmount - amountReceived; 
	}

}
