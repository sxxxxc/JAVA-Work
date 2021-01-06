//389 11.15
import java.util.Scanner;
public class Convex_polygon_area {
	
	public static float caculate(point vertex[],int pointNum){
    	int i=0;
    	float temp=0;
    	for(;i<pointNum-1;i++)
    	{
    		temp+=(vertex[i].x-vertex[i+1].x)*(vertex[i].y+vertex[i+1].y);
    	}
    	temp+=(vertex[i].x-vertex[0].x)*(vertex[i].y+vertex[0].y);
    	return temp/2;
    }
    public static void main(String args[]) 
    {
    	point[] vertex=new point[100];
    	int pointNum=0;
    	Scanner in = new Scanner(System.in);
    	for(int i=0;i<100;i++)
    	{
    		vertex[i]= new point();
    	}
    	System.out.println("Enter the number of points£º");
    	pointNum=in.nextInt();
    	for(int i=0;i<pointNum;i++)
    	{
    		vertex[i].x = in.nextInt();
    		vertex[i].y = in.nextInt();
    	}
    	System.out.println("the total area is:"+caculate(vertex,pointNum));
    }
class point{
	 public int x;
	 public int y;
	 point(){
		 this.x=0;
		 this.y=0;
		 }
	 }
}
