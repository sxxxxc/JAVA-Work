//314 9.10
public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuadraticEquation expr = new QuadraticEquation(1,4,4);
		if(expr.getRoot1() == 0 && expr.getRoot2() == 0){
			System.out.println("The equation has no roots");
		}
		else if(expr.getRoot1() == expr.getRoot2())
			System.out.println("R : " + expr.getRoot1());
		else
			System.out.println("R1 : " + expr.getRoot1() + "    " + "R2 :" + expr.getRoot2());
		}
	
}
class QuadraticEquation{
	private double a,b,c;

	QuadraticEquation(double x, double y, double z){
		a = x;
		b = y;
		c = z;
    }

    public double getA(){
        return a;
    }

    public double getB(){
        return b;
    }

    public double getC(){
        return c;
    }

    public double getDiscriminant(){
        return b*b - 4*a*c;
    }

    public double getRoot1(){
        double judge = this.getDiscriminant();
        if(judge >= 0){
            return (-b + Math.sqrt(judge))/(2*a);
        }
        else
            return 0;
    }

    public double getRoot2(){
        double judge = this.getDiscriminant();
        if(judge >= 0){
            return (-b + Math.sqrt(judge))/(2*a);
        }
        else
            return 0;
    }
}