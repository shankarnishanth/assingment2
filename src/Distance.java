import static java.lang.Math.sqrt;

public class Distance {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int Y = Integer.parseInt(args[1]);
        double distance = sqrt(x*x+Y*Y);
        System.out.println(distance);
    }
}
