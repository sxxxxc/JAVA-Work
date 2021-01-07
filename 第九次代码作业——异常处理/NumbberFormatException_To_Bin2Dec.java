//P427 12.7
import java.util.Scanner;
public class NumbberFormatException_To_Bin2Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a bin number: ");
		String bin = input.nextLine();
		try {
			int i = bin2Dec(bin);
			System.out.println(i);
		} 
		catch (NumberFormatException e) {
			System.out.println(e);
		}
	}
	
	public static int bin2Dec(String bin){
		bin = bin.toUpperCase();
		for (int i = 0; i < bin.length(); i++) {
			char binChar = bin.charAt(i);
			if (binChar =='0'||binChar=='1') {
				return Integer.parseInt(bin, 2);
			} 
			else {
				throw new NumberFormatException("NumberFormatException");
			}
		}
		return Integer.parseInt(bin, 2);
	}
}