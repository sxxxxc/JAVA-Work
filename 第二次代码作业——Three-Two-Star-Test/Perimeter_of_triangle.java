//P96 3.19
import java.util.Scanner;
public class Perimeter_of_triangle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		//enter three numbers
		System.out.print("请输入三角形的三条边： ");
		double number1=input.nextDouble();
		double number2=input.nextDouble();
		double number3=input.nextDouble();
		double sum=number1+number2+number3;
		if(number1+number2>number3
				&&number1+number3>number2
				&&number2+number3>number1)
			System.out.println("三角形的周长为:"+sum);
		else
			System.out.println("输入不合法！");
	}

}
