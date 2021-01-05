//314 9.11
public class Linear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        LinearEquation expr1 = new LinearEquation(9.0,4.0,3.0,-5.0,-6.0,-21.0);
        LinearEquation expr2 = new LinearEquation(1.0,2.0,2.0,4.0,4.0,5.0);

        if(expr1.isSolvable()){
            System.out.println("x:" + expr1.getX() + "  " + "y:" + expr1.getY());
        }
        else
            System.out.println("The equation has no solution");

        if(expr2.isSolvable()){
            System.out.println("x:" + expr2.getX() + "  " + "y:" + expr2.getY());
        }
        else
            System.out.println("The equation has no solution");
    }
}
class LinearEquation {
    private double a, b, c, d, e, f;

    public LinearEquation(double v1, double v2, double v3, double v4, double v5, double v6) {
        a = v1;
        b = v2;
        c = v3;
        d = v4;
        e = v5;
        f = v6;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    public boolean isSolvable() {
        if ((a * d - b * c) != 0)
            return true;
        else
            return false;
    }

    public double getX() {
        return (e * d - b * f) / (a * d - b * c);
    }

    public double getY() {
        return (a * f - e * c) / (a * d - b * c);
    }
}