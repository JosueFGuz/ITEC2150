import java.util.ArrayList;
import java.util.Scanner;
public class DayOne {
//meal class  - name subscription veggie
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Do you want to register or check?");
		System.out.println("1. Register");
		System.out.println("2. See");
		System.out.println("3. Exit");
		int one = input.nextInt();
		
		
		System.out.println("What is your subscription, monthly or yearly? :");
		String sub = input.next();
		System.out.println("Are you a vegeterian? Yes or No :");
		String veggie = input.next();
		System.out.println("What is your name?");
		String name  = input.next();

		RegistrationClass Mickey = new RegistrationClass("Yes","No","Mickey");
		System.out.println(Mickey.toString());
		
	 //boolean for if you wanna register & if you're a vegetarian, arraylist to display the check and the data that has been inputted.
		
	}
	
	public class RegistrationClass {
			
	String sub;
	String veggie;
	String name;
	
	public RegistrationClass(String sub, String veggie, String name)
	{ 
	  this.sub = sub;
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
		return("You said: " + this.getSub()+ " for a subscrition, " + this.getVeggie()+ " if you were a vegetarian, and " + this.getName()+ " is your name.\nCongradulations, you are now registered." );
	    }
	}

	public class CheckClass { 
		

}
}