//243 7.19
import java.util.Scanner;
public class Judgment_Sort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		System.out.print("Enter the size of the list:");
        Scanner input = new Scanner(System.in);
        number=input.nextInt();
        int[] list = new int[number];
        System.out.print("Enter the contents of the list:");
        for(int i=0;i<list.length;i++){
            list[i]=input.nextInt();
        }
        System.out.print("The list has "+number+" integers ");
        for(int i=0;i<list.length;i++){
            System.out.print(list[i]+" ");
        }
        System.out.print("\n");
        if(!isSorted(list)){
            System.out.println("The list is not sorted");
        }
        else System.out.println("The list is already sorted");
    }
    public static boolean isSorted(int[] list){
        for(int i = 1;i < list.length;i++){
            if(list[i-1] > list[i]){
                return false;
            }
        }
        return true;
	}
}
