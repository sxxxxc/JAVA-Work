//11-5
public class PolymorphismDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayObject(new CircleFromSimpleGeometricObject(1,"red",false));
		displayObject(new RectangleFromSimpleGeometricObject(1,1,"black",true));

	}

	private static void displayObject(SimpleGeometricObject object) {
		// TODO Auto-generated method stub
		System.out.println("Create on "+object.getDateCreated()+" Color is "+object.getColor());
	}
}

