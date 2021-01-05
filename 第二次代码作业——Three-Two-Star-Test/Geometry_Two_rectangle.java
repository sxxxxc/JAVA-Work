//99 3.28
import java.util.Scanner;
public class Geometry_Two_rectangle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		double x1,y1,w1,h1,x2,y2,w2,h2;
		System.out.print("Enter rl's center x-, y-coordinates, width, and height:");
		x1=input.nextDouble();
		y1=input.nextDouble();
		w1=input.nextDouble();
		h1=input.nextDouble();
		System.out.print("Enter r2's center x-, y-coordinates, width, and height:");
		x2=input.nextDouble();
		y2=input.nextDouble();
		w2=input.nextDouble();
		h2=input.nextDouble();
		double d1=Math.abs(x1-x2);
		double d2=Math.abs((w1-w2)*0.5);
		double d3=Math.abs(y1-y2);
		double d4=Math.abs((h1-h2)*0.5);
		if(d1<=d2 && d3<=d4) {
			System.out.println("r2 is inside rl");
		}
		else if(d1<=w1+w2 &&d3<=h1+h2) {
			System.out.println("r2 overlaps rl");
		}
		else {
			System.out.println("r2 does not overlaps rl");
		}
			
	}

}
