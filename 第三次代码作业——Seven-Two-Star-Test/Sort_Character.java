//246 7.34
import java.util.Scanner;
public class Sort_Character {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Please enter a string:");
		Scanner input = new Scanner(System.in);
		String str=input.nextLine();
        str = sort(str);
        System.out.println("The sorted string is "+str);
	}
	 public static String sort(String s){
	        char[] chs = s.toCharArray();
	        java.util.Arrays.sort(chs);
	        String result = String.valueOf(chs);
	        return result;
	 }
}
