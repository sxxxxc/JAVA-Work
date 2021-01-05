//243 7.18
import java.util.Scanner;
public class Bubble_Sort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        double[] list = new double[10];
        System.out.print("Please enter ten numbers: ");
        for(int i=0;i<10;i++){
            list[i]=input.nextDouble();
        }
        bubbleSort(list);
        System.out.print("Bubble sorted: ");
        for(int i=0;i<10;i++)
            System.out.print(list[i]+" ");
    }
    public static void bubbleSort(double[] list){
        boolean n=false;
        for(int i=0;i<list.length-1;i++){
            n = false;
            for(int j=list.length-1;j>i;j--){
                if(list[j-1]>list[j]){
                    double tmp=list[j-1];
                    list[j-1]=list[j];
                    list[j]=tmp;
                    n=true;
                }
            }
            if(n==false)
                break;
        }
	}
}
