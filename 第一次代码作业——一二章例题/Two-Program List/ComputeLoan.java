//2-9
import java.util.Scanner;
public class ComputeLoan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter annual interest rate,e.g.,7.25%: ");
		double annualInterestRatet = input.nextDouble();
		double monthltyInterestRate = annualInterestRatet / 1200;
		System.out.print("Enter number of years as an intefer ,e.g.,5: ");
		int numberOfYears= input.nextInt();
		
		//Enter loan amount
		System.out.print("Enter loan amount ,e.g. , 120000.95: ");
		double loanAmount=input.nextDouble();
		
		//Calculate payment
		double monthlyPayment=loanAmount *monthltyInterestRate/
				(1-1/Math.pow(1+monthltyInterestRate, numberOfYears *12));
		double totalPayment =monthlyPayment*numberOfYears*12;
		
		//Display result
		System.out.println("The monthly payment is $" +
		(int)(monthlyPayment*100)/100.0);
		System.out.println("The total payment is $" +
		(int)(totalPayment*100)/100.0);

	}

}
