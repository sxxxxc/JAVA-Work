//97 3.21
import java.util.Scanner;
public class Science_The_Day_of_the_week {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		//enter three numbers
		int h;
		double j,k;
		System.out.print("Enter year :(e.g.,2012): ");
		int year=input.nextInt();
		System.out.print("Enter month: 1-12:");
		int m=input.nextInt();
		System.out.print("Enter the day of the month: 1-31:");
		int q=input.nextInt();
		j=year/100;
		k=year%100;
		h=(int)(q+(26*(m+1))/10+k+k/4+j/4+5*j)%7;
		if(h==0)
			System.out.println("Day of the week is Saturday") ;
		if(h==1)
			System.out.println("Day of the week is Sunday");
		if(h==2)
			System.out.println("Day of the week is Monday");
		if(h==3)
			System.out.println("Day of the week is Tuesday");
		if(h==4)
			System.out.println("Day of the week is Wednesday");
		if(h==5)
			System.out.println("Day of the week is Thursday");
		if(h==6)
			System.out.println("Day of the week is Friday");
	}

}
