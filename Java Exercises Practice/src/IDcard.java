
public class IDcard extends Card{
private String id;
public IDcard(String name, String id){
	super(name);
	this.id = id;
	}
public String format()
{
  return super.format() + ", ID: " + id;
}

public String getID(){
	return id;
}

}
