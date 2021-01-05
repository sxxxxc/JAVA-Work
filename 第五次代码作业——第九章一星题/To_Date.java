//312 9.3
import java.util.Date;//define Date 
public class To_Date {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long time=10000;
		java.util.Date date=new Date();
		date= new Date(time);
	
		for (int i=0;i<=7;i++) {
			date= new Date(time);
			System.out.println(time+":"+date.toString());
			time*=10;
		}
	}
}
