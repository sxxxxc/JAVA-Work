//241 7.3
import java.util.Scanner;
public class Count_numbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers=new int[101];
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the integers between 1 and 100: ");
        String[] str=input.nextLine().split(" ");
        for (int i=0;i<str.length;i++)
            numbers[Integer.parseInt(str[i])]++;
        for (int i = 1;i<numbers.length;i++){
            if (numbers[i]==1)
                System.out.println(i+" occurs " + numbers[i] + " time ");
            else if (numbers[i] > 1)
                System.out.println(i + " occurs " + numbers[i] + " times ");
            else
                continue;
        }
	}
}
