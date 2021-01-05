//244 7.24
public class Emulation_Collect_Coupons {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] suit={"Spades","Hearts","Diamonds","Clubs"};
        boolean[] check=new boolean[4];
        for (int i=0;i<4;i++)
            check[i]=false;
        int sum=0;
        while (!(check[0] && check[1] && check[2] && check[3]))
            sum += checkPoker(check, suit);
        System.out.println("Numbers of picks: "+sum);
    }
    public static int checkPoker(boolean[] check, String[] suit){
        String[] card = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        int[] poker = new int[52];
        for (int i = 0; i < 52; i++)
            poker[i] = i;
        for(int i=poker.length-1; i > 0; i--){
            int j=(int)(Math.random()*(i+1));
            int temp=poker[i];
            poker[i]=poker[j];
            poker[j]=temp;
        }
        int m=0;
        while (true){
            m++;
            int n=(int)(Math.random() * 52);
            int color = n % 4,num=n%13;
            if(!check[color]){
                check[color]=true;
                System.out.println(card[num]+" of "+suit[color]);
                break;
            }
        }
        return m;
	}
}
