//243 7.17
import java.util.Scanner;
public class Sort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.print("Please enter the numbers of Students:");
        int number=input.nextInt();
        int[] score=new int[number];
        String[] name=new String[number];
        for (int i=0;i<number;i++){
            System.out.print("Please enter the name of students:");
            name[i]=input.next();
            System.out.print("please enter the score of students:");
            score[i]=input.nextInt();
        }
        for (int i=0;i<number-1;i++){
            for (int j=0;j<number-i-1;j++){
                if (score[j]>score[j+1]){
                    int temp=score[j];
                    score[j]=score[j+1];
                    score[j+1]=temp;
                    String str=name[j];
                    name[j]=name[j+1];
                    name[j+1]=str;
                }
            }
        }
        for (int i=number-1;i>=0;i--)
            System.out.println("Name:"+name[i]+"  Score:"+score[i]);
	}
}
