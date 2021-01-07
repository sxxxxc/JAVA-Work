//427 12.10
import java.util.ArrayList;
import java.util.List;
public class OutOfMemoryError_To {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String[]> list = new ArrayList<String[]>();
		try {
			while(true) {
				list.add(args);
			}
		}
		catch(OutOfMemoryError error) {
			System.out.println("end");
		}
	}
}
