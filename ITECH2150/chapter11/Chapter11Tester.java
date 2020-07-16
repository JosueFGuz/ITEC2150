package chapter11;

public class Chapter11Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circleOne = new Circle(3.5);
		Circle circleTwo = new Circle("Yellow", false, 2.3);
		Circle circleThree = new Circle ("Green", true, 0);
		
		Rectangle rectangleOne = new Rectangle("Black", false, 3.4, 2.7);
		Rectangle rectangleTwo = new Rectangle("White", true, 2.4, 2.7);
		Rectangle rectangleThree = new Rectangle("Red", false, -3.4,-4.7);
		
		//circles
		System.out.println("Circle One: " + circleOne);
		System.out.println("Circle Two: " + circleTwo);
		System.out.println("Circle Three: " + circleThree);
		
		//rectangles
		System.out.println("Rectangle One: " + rectangleOne);
		System.out.println("Rectangle Two: " + rectangleTwo);
		System.out.println("Rectangle Three: " + rectangleThree);

		
	}

}
