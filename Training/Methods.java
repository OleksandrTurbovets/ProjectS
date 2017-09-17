public class Methods {
    public static void main(String[] args) {
        Object name = "Alex";
        Object f = 5;
        hello(name, f);
        System.out.println(sum(1, 2));
        double v = 2.0;
        double sq = square(v);
        System.out.println(sq);
    }

    private static double square(double dv) {
        double sq = dv * dv;
        return sq;
    }

    static int sum(int num1, int num2){
        return num1 + num2;
    }

    static void hello(Object n, Object f) {
        System.out.println("Hello " + n);
        System.out.println(5 + Integer.valueOf(f.toString()));
    }

    static void hello(){
        System.out.println("HELLLLOOOOO");
    }
}
