
public class Dady {
	String sub;
	String veggie;
	String name;
	
	public Dady(String sub, String veggie, String name)
	{ this.sub = sub;
	  this.veggie = veggie;
	  this.name = name;
	}

	public String getSub() {
		return sub;
	}

	public String getVeggie() {
		return veggie;
	}

	public String getName() {
		return name;
	}
	
	public String toString()
	{
		return("You said: " + this.getSub()+ " for a subscrition, " + this.getVeggie()+ " if you were a vegetarian, and " + this.getName()+ " is your name.");
}
	}