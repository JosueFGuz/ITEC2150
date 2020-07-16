import java.util.Scanner;
public class MealPlanScanner {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Do you want to:");
		System.out.println("1: Register for a meal plan");
		System.out.println("2: Check");
		System.out.println("0: Exit");
		
		int option = input.nextInt();
		
		while (option !=0) {
			if (option == 1) {
		
		
		
		
		System.out.println("Hello, please enter the follow information to find a meal plan most suitable for you:");
		System.out.println("What is your name?");
		String name = input.next();
		System.out.println("Are you a vegetarian? Yes or no: ");
		String veggie = input.next();
		System.out.println("Any allergies? Yes or no: ");
		String allergy = input.next();

		
		
		MealScanner one = new MealScanner("name", "veggie", "allergy");
		System.out.println(one);
		} else if(option == 2 ){
			System.out.println(one);
		}
		}
	}
	public class MealScanner{
		private String name;
		private String veggie;
		private String allergy;

		
		public MealScanner(String name, String veggie, String allergy, int meals) {
			super();
			this.name = name;
			this.veggie = veggie;
			this.allergy = allergy;
		
		}

		public String getName() {
			return name;
		}

		public String getVeggie() {
			return veggie;
		}

		public String getAllergy() {
			return allergy;
		}

		}
		
	}

