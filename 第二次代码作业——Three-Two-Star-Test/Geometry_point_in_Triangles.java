//99 3.27
import java.util.Scanner;
public class Geometry_point_in_Triangles {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		double x,y;
//		double s1,s2,s3,area;
//		double a,b,c,p;
		System.out.print("Please Enter a point's x- and y-coordinates: ");
		x=input.nextDouble();
		y=input.nextDouble();
		if(x>=0&&x<=200 && y>=0&&y<=100) {
			if((y-100)/x<=-0.5&&(y-100)/x>=-100) {
				System.out.println("The point is in the triangle");
			}
			else
				System.out.println("The point is not in the triangle");
		}
		else
			System.out.println("The point is not in the triangle");
//		a=Math.sqrt(x*x+(y-100)*(y-100));
//		b=Math.sqrt((x-200)*(x-200)+y*y);
//		c=Math.sqrt(200*200+100*100);
//		p=(a+b+c)/2;
//		s1=y*200*0.5;
//		s2=x*100*0.5;
//		s3=Math.sqrt(p*(p-a)*(p-b)*(p-c));
//		area=100*200/2;
//		if(s1+s2+s3==area) {
//			System.out.println("The point is in the triangle");
//		}
//		else
//			System.out.println("The point is not in the triangle");
	}
}
