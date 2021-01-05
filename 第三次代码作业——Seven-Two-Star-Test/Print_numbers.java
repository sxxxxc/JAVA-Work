//241 7.5
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Print_numbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<Integer>();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        String[] strings=input.nextLine().split(" ");
        int sum=0;
        for (int i=0;i<strings.length;i++) {
            if (!list.contains(Integer.parseInt(strings[i]))) {
            	list.add(Integer.parseInt(strings[i]));
                sum++;
            }
        }
        System.out.println("The number of distinct numbers is " + sum);
        System.out.print("The distinct numbers are: ");
        for (int i:list)
        System.out.print(i + " ");
	}
}
