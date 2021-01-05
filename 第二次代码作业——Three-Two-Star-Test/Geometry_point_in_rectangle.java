//98 3.23
import java.util.Scanner;
public class Geometry_point_in_rectangle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.print("Enter a point with two coordinates:  ");
		double x=input.nextDouble();
		double y=input.nextDouble();
		double d=x*x+y*y;
		if(x>-5&&x<5&&y<2.5&&y>-2.5)
			System.out.println("Point"+"("+x+","+y+")" +"is in the rectangle") ;
		else
			System.out.println("Point"+"("+x+","+y+")" +"is not in the rectangle") ;
	}

}
