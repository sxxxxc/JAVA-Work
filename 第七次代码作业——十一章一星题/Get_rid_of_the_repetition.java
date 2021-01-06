//389 11.13
import java.util.ArrayList;
import java.util.Scanner;
public class Get_rid_of_the_repetition {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    ArrayList<Integer> list = new ArrayList<>();
	    Scanner input=new Scanner(System.in);
	    for (int i=0;i<10;i++) {
	    	list.add(input.nextInt());
	    	
	    }
	    for(Integer as:list) 
	        System.out.print(as+" ");
	    System.out.println();
	    removeDuplicate(list);
	    for(Integer as:list) 
	        System.out.print(as+" ");
	}
	public static void removeDuplicate(ArrayList<Integer> list) {
	    int size = list.size();
	    int remove = 0;
	    for(int i = 0; i < size - remove;i++) {
	        for(int j = 1+i; j < size - remove;j++) {
	            if(list.get(i) == list.get(j)) {
	                list.remove(j); 
	                   remove++;
	                   j=j-1;
	            }
	        }
	    }
	}
}
