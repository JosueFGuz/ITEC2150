
public class MealPlanExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MealPlanPrac One = new MealPlanPrac("Josue", true,false,"monthy",  4.5);
		System.out.println(One.getName());
		System.out.println(One.isSubscribe());
		System.out.println(One.isVeggie());
		System.out.println(One.getSubInterval());
		System.out.println(One.getMaxBudget());
		
	}

}
