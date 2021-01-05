//312 9.4
import java.util.Random;
public class To_Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator1= new Random(1000);
		for (int i=0;i<50;i++) 
			System.out.print(((Random) generator1).nextInt(100)+ " ");
	}
}
