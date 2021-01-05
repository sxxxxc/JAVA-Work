//245 7.32
import java.util.Scanner;
public class List_partition {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.print("Enter list1 size: ");
        int num1 = input.nextInt();
        System.out.print("Enter list contents: ");
        int[] l1 = new int[num1];
        for(int i = 0;i < num1;i++)
            l1[i] = input.nextInt();
        partition(l1);
        System.out.print("After the partition, the list is ");
        for(int i = 0;i < num1;i++)
            System.out.print(l1[i] + " ");
        System.out.println();
    }
    public static int partition(int[] list){
        int len = list.length;
        int[] help=new int[2*len];
        int pivot=list[0];
        help[len+1]=list[0];
        int p1 = len;
        int p2 = len + 2;
        for(int i = 1;i < len;i++) {
            if(list[i]>pivot) {
                help[p2]= list[i];
                p2++;
            }
            else {
                help[p1] = list[i];
                p1--;
            }
        }
        for(int i = 0;i < len;i++) {
        	list[i] = help[p1 + 1 + i];
        }
        return len - p1;
	}
}
