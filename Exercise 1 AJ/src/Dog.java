
public class Dog {
	private String color;
	private int height;
	private double weight;
public Dog (String dogColor, int dogHeight, double dogWeight)
{
	dogColor = color;
	dogHeight = height;
	dogWeight = weight;
}

public String toString()
{
 return "dog is " + color;	//returns dog color
}

public Boolean isEqual(Dog p)//checks if two dogs are equal based on height and color
{
	if(height == p.height && color.equals(p.color))
		return true;
	else 
		return false;
}
/**public String color(String dogColor)
{
	color = dogColor; //sets dog color
}
public int height(int dogHeight)
{
	height = dogHeight; //sets dog height
	
}
public double weight(double dogWeight)
{
	weight = dogWeight; //sets dog weight
}

public String toString()
{
 System.out.println("dog is" + color);	//returns dog color
}

public Boolean isEqual(int height2, String color2)//checks if two dogs are equal based on height and color
{
	if(height == height2 && color.equals(color2))
		return true;
	else 
		return false;
}*/

}
