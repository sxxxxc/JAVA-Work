//390 11.18
import java.util.ArrayList;
public class Character_Array_list {

	public static ArrayList<Character> toCharacterArray(String s){
		
		String[] str="abc".split("");
		ArrayList<Character>list =new ArrayList<>();
		
		for (int i =0;i<str.length;i++) {
			char[]a=str[i].toCharArray();
			char ch=a[0];
			list.add(ch);
		}
		return list;
	}
}
