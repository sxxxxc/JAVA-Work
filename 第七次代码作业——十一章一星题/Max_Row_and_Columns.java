//388 11.9
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class Max_Row_and_Columns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> rowlist = new ArrayList<>();
	    ArrayList<Integer> columnlist = new ArrayList<>();
	    Integer row = 0;   
	    Integer column = 0;
	    Integer row_Max = 0; 
	    Integer column_Max = 0; 
	    Random rand = new Random();
	    System.out.println("Enter the array size n: ");
	    int n = input.nextInt();
	    int[][] array = new int[n][n];

	    for(int i = 0;i < array.length;i++) {
	        for(int j = 0;j < array[0].length;j++) {
	            if(array[j][i] == 1) column++;
	        }
	        if(column > column_Max) column_Max = column;
	        column = 0;
	    }
	    
	    for(int i = 0;i < array.length;i++) {
	        for(int j = 0;j < array[0].length;j++) {
	            int randInt = rand.nextInt(2); 
	            array[i][j] = randInt;
	            System.out.print(array[i][j] + " ");
	            if(randInt == 1) row++;
	        }
	        if(row > row_Max) row_Max = row;

	        row = 0;
	        System.out.println();
	    }

	    System.out.println("The largest row index: ");
	    for(Integer a:rowlist)
	        System.out.println(a + " ");
	    System.out.println("The largest column index");
	    for(Integer b:columnlist)
	        System.out.print(b + " ");
	}
}

