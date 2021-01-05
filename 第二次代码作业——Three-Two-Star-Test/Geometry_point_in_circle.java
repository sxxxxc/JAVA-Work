//97 3.22
import java.util.Scanner;
public class Geometry_point_in_circle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.print("Enter a point with two coordinates: ");
		double x=input.nextDouble();
		double y=input.nextDouble();
		double d=x*x+y*y;
		if(d>100)
			System.out.println("Point"+"("+x+","+y+")" +"is not in the circle") ;
		else
			System.out.println("Point"+"("+x+","+y+")" +"is in the circle") ;
	}

}
