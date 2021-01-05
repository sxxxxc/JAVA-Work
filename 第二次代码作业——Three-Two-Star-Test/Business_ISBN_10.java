//95 3.9
import java.util.Scanner;
public class Business_ISBN_10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d1,d2,d3,d4,d5,d6,d7,d8,d9;
		int num,checknum;
		System.out.print("Please enter the first 9 digits:");
		Scanner input = new Scanner(System.in);
		num=input.nextInt();
		d1=num/100000000;
		d2=(num-100000000*d1)/10000000;
		d3=(num-100000000*d1-10000000*d2)/1000000;
		d4=(num-100000000*d1-10000000*d2-1000000*d3)/100000;
		d5=(num-100000000*d1-10000000*d2-1000000*d3-100000*d4)/10000;
		d6=(num-100000000*d1-10000000*d2-1000000*d3-100000*d4-10000*d5)/1000;
		d7=(num-100000000*d1-10000000*d2-1000000*d3-100000*d4-10000*d5-1000*d6)/100;
		d8=(num-100000000*d1-10000000*d2-1000000*d3-100000*d4-10000*d5-1000*d6-100*d7)/10;
		d9=num-100000000*d1-10000000*d2-1000000*d3-100000*d4-10000*d5-1000*d6-100*d7-10*d8;
		checknum=(d1+d2*2+d3*3+d4*4+d5*5+d6*6+d7*7+d8*8+d9*9)%11;
		if(checknum==10)
			System.out.println("Enter the first 9 digits of an ISBN as integer: "+d1+d2+d3+d4+d5+d6+d7+d8+d9+"X");
		else
			System.out.println("Enter the first 9 digits of an ISBN as integer: "+d1+d2+d3+d4+d5+d6+d7+d8+d9+checknum);
	}

}