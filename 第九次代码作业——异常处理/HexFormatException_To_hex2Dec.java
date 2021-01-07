//429 12.8
import java.util.Scanner;
public class HexFormatException_To_hex2Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a hex number: ");
		String hex = input.nextLine();
		int i = hexToDecimal(hex);
		System.out.println(i);
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
				throw new NumberFormatException("HexFormatException");
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
	
	public void HexFormat(String hex) throws HexFormatException {
		hexToDecimal(hex);
	}
	
	class HexFormatException extends Exception {
		String hex;
		public HexFormatException(String hex) {
			super("HexFormatException: " + hex);
			this.hex=hex;
		}

		public String getHexString() {
			return hex;
		}
	}
}	