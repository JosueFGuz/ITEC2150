import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class BookTracker {

	public static void main(String[] args) {
		// MealPlan one = new MealPlan("Bong", false, false, 10.0);
		// System.out.println(one);

		List<Book> bookList = new ArrayList<>();

		Scanner input = new Scanner(System.in);
		System.out.println("1: Register");
		System.out.println("2: Check");
		System.out.println("0: Exit");
		int option = input.nextInt();
		while (option != 0) {
			if (option == 1) {

				System.out.println("What is your name?");
				String name = input.next();
				System.out.println("Do you want to Register? True or false");
				boolean isRegistered = input.nextBoolean();
				System.out.println("What is the name of the book you're looking to check out?");
				String nameBook = input.next();
				System.out.println("Do you want to check more books out? True or false?");
				boolean moreBooks = input.nextBoolean();
				
				bookList.add(new Book(name, isRegistered, nameBook, moreBooks));
				
			} else if (option == 2) {
				
				System.out.println("What is your name?");
				String name = input.next();


			} else {
				System.out.println("You've made a typo");
			}
			System.out.println("1: Register");
			System.out.println("2: Check");
			System.out.println("0: Exit");
			option = input.nextInt();
		}
		
		System.out.println("Make sure you save your data");
		System.exit(0);

	}

}
