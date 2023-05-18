public class SpringSeason {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]),d = Integer.parseInt(args[1]);
        System.out.println(m);
        System.out.println(d);
        if((m>=3 && m<=6) && (d>=20)){
            System.out.println("true");
        }
        else{
            System.out.println("False");
        }
    }
}
