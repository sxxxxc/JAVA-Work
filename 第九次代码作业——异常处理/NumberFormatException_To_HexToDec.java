//P427 12.6
import java.util.Scanner;
public class NumberFormatException_To_HexToDec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a hex number: ");
		String hex = input.nextLine();
		try {
			int i = hexToDecimal(hex);
			System.out.println(i);
		} 
		catch (NumberFormatException e) {
			System.out.println(e);
		}
	}
	
	public static int hexToDecimal(String hex){
		int decimalValue = 0;
		hex = hex.toUpperCase();
		for (int i = 0; i < hex.length(); i++) {
			char hexChar = hex.charAt(i);
			if ((hexChar >='A'&&hexChar<='F') || (hexChar>='0'&& hexChar<= '9')) {
				decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
			} 
			else {
				throw new NumberFormatException("NumberFormatException");
			}
		}
		return decimalValue;
	}
	
	public static int hexCharToDecimal(char ch) {
		if (ch >= 'A' && ch <= 'F')
			return 10 + ch - 'A';
		else
			return ch - '0';
	}
}		