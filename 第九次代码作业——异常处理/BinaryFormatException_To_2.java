//427 12.9
import java.util.Scanner;

public class BinaryFormatException_To_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a bin number: ");
		String bin = input.nextLine();
		try {
			int i = bin2Dec(bin);
			System.out.println(i);
		} 
		catch (BinaryFormatException e) {
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
				throw new NumberFormatException("BinaryFormatException");
			}
		}
		return Integer.parseInt(bin, 2);
	}
	class BinaryFormatException extends NumberFormatException {
		public BinaryFormatException(String bin) {
		super(bin);
		}
	}
}