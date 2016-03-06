
public class circle {
public int radius;
private int x;
private int y;

public circle(){
this(0,0,0);

}
public circle(int radius, int x, int y){
this.radius = radius;
this.x = x;
this.y = y;
}


public String toString(){
	return "Center at (" + x + ", " + y + ") radius is: " + radius;
}

}
