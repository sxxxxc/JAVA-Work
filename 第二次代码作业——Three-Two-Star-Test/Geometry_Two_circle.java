//99 3.29
import java.util.Scanner;
public class Geometry_Two_circle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		double x1,y1,r1,x2,y2,r2;
		double d;
		System.out.print("Please Enter circle1's center x-, y-coordinates, and radius: ");
		x1=input.nextDouble();
		y1=input.nextDouble();
		r1=input.nextDouble();
		System.out.print("Please Enter circle2's center x-, y-coordinates, and radius: ");
		x2=input.nextDouble();
		y2=input.nextDouble();
		r2=input.nextDouble();
		d=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		if(d<=Math.abs(r1-r2)) {
			System.out.println("circle2 is inside circlel");
		}
		else if(d<=r1+r2) {
			System.out.println("circle2 overlaps circlel");
		}
		else {
			System.out.println("circle2 does not overlaps circlel");
		}
	}

}
