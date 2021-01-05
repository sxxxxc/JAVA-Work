//243 7.23
public class Game_Storage_cabinet {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] L=new boolean[100];
        for(int i = 0;i<L.length;i++){
            L[i]=false;
        }
        for(int i=0;i<L.length;i++){   //S1
            L[i]=true;
        }
        for(int i=1;i<L.length;i+=2){   //S2
            L[i]=false;
        }
        for(int i=2;i<100;i++){
            for(int j=i;j<L.length;j+=(i+1)){
                if(L[i]==false)
                    L[i]=true;
                else L[i]=false;
            }
        }
        for(int i=0;i<L.length;i++){
            int sum=1;
            if(L[i]==true) {
                System.out.print(i+1+" ");
                sum++;
            }
            if(sum%5==0){
                System.out.println();
            }
        }
	}
}
