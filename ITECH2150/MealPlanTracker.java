import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class MealPlanTracker {

	public static void main(String[] args) {
		// MealPlan one = new MealPlan("Bong", false, false, 10.0);
		// System.out.println(one);

		List<MealPlan> mealPlanList = new ArrayList<>();

		Scanner input = new Scanner(System.in);
		System.out.println("1: Register");
		System.out.println("2: Check");
		System.out.println("0: Exit");
		int option = input.nextInt();
		while (option != 0) {
			if (option == 1) {
				// for register one student
				System.out.println("What is your name?");
				String name = input.next();
				System.out.println("do you want be? true or false");
				boolean subscription = input.nextBoolean();
				System.out.println("Are you vegeterian? true of false");
				boolean vegeterian = input.nextBoolean();
				System.out.println("How much do you want to deposit?");
				double balance = input.nextDouble();

				// Please create a new MealPlan object here
				//MealPlan one = new MealPlan(name, subscription, vegeterian, balance);
				//System.out.println(one);
				mealPlanList.add(new MealPlan(name, subscription, vegeterian, balance));
				
			} else if (option == 2) {
				//for(MealPlan mP : mealPlanList) {
			   //System.out.println(mP);
				
				System.out.println("What is your name?");
				String name = input.next();
				

			} else {
				System.out.println("you put a typo");
			}
			System.out.println("1: Register");
			System.out.println("2: Check");
			System.out.println("0: Exit");
			option = input.nextInt();
		}
		
		System.out.println("please make sure you save your data");
		System.exit(0);

	}

}
