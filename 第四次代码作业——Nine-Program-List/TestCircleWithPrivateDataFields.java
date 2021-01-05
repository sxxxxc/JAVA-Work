//9-9
public class TestCircleWithPrivateDataFields {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a circle with radius 5.0
		CircleWithPrivateDataFields myCircle =
				new CircleWithPrivateDataFields(5.0);
		System.out.println("The area of circle of radius "
				+ myCircle.getRadius() + " is " + myCircle.getArea());
		
		//Increase myCircle's radius by 10%
		myCircle.setRadius(myCircle.getRadius()* 1.1);
		System.out.println("The area of circle of radius "
				+ myCircle.getRadius() + " is " + myCircle.getArea());
		
		System.out.println("The number of objects created is "
				+ CircleWithPrivateDataFields.getNumberOfObjects());
	}

}
