
public class MealPlan {
	private String name;
	private boolean isSubscribed;
	private boolean isVegeterian;
	private double balance;
	
	public MealPlan(String name, boolean isSubscribed, boolean isVegeterian, double balance) {
		//super();
		this.name = name;
		this.isSubscribed = isSubscribed;
		this.isVegeterian = isVegeterian;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public boolean isSubscribed() {
		return isSubscribed;
	}

	public boolean isVegeterian() {
		return isVegeterian;
	}

	public double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "MealPlan [name=" + name + ", isSubscribed=" + isSubscribed + ", isVegeterian=" + isVegeterian
				+ ", balance=" + balance + "]";
	}

}
