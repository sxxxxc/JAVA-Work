//312 9.5
import java.util.GregorianCalendar;
public class To_GregorianCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar GregorianCalendar1=new GregorianCalendar();
		int now_year=GregorianCalendar1.get(GregorianCalendar1.YEAR);
		int now_month=GregorianCalendar1.get(GregorianCalendar1.MONTH);
		int now_day=GregorianCalendar1.get(GregorianCalendar1.DAY_OF_MONTH);
		System.out.println("now date: "+ "year: "+now_year +" ,month: "+ now_month+" ,day: "+now_day);
		long time=1234567898765L;
		GregorianCalendar GregorianCalendar2=new GregorianCalendar();
		GregorianCalendar2.setTimeInMillis(time);
		int print_year=GregorianCalendar2.get(GregorianCalendar2.YEAR);
		int print_month=GregorianCalendar2.get(GregorianCalendar2.MONTH);
		int print_day=GregorianCalendar2.get(GregorianCalendar2.DAY_OF_MONTH);
		System.out.println("print date: "+ "year: "+print_year +" ,month: "+ print_month+" ,day: "+print_day);
	}
}
