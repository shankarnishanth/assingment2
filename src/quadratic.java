import static java.lang.Math.sqrt;

public class quadratic {
    public static void main(String[] args) {
        int delta,a = 10,b = 5,c = 15;
        double x;
        delta = b*b - 4*a*c;
        System.out.println(delta);
        x = (-b - sqrt(delta))/(2*a);
        System.out.println(x);
        System.out.println("a*x*x + b*x + c:" + a*x*x + b*x + c);
    }
}
