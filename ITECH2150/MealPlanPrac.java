
public class MealPlanPrac {
	private String Name;
	private boolean Subscribe;
	private boolean Veggie;
	private String SubInterval;
	private double MaxBudget;
	public MealPlanPrac(String name, boolean subscribe, boolean veggie, String subInterval, double maxBudget) {
		super();
		this.Name = name;
		this.Subscribe = subscribe;
		this.Veggie = veggie;
		this.SubInterval = subInterval;
		this.MaxBudget = maxBudget;
	}
	public String getName() {
		return Name;
	}
	public boolean isSubscribe() {
		return Subscribe;
	}
	public boolean isVeggie() {
		return Veggie;
	}
	public String getSubInterval() {
		return SubInterval;
	}
	public double getMaxBudget() {
		return MaxBudget;
	}
	
	public String toString() {
		return "Meal plan inputted information. "+ Name + ", subscription is: " + Subscribe + ", " + Veggie + " to being a vegetarian, " + SubInterval + " is how often they want their subscription "
+ MaxBudget + " is the most they want to spend on their subscription.";
		}
}
