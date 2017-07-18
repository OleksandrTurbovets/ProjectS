public class LightSpeed {
    public static void main(String[] args) {
        double lightSpeed = 299792458;
        double nanoSecond = 1000000000;
        double result = lightSpeed * 100 / nanoSecond;
        System.out.println(result);

        double ops = 2200000000d;
        double resultOps = lightSpeed * 100 / ops;
        System.out.println(resultOps);
    }
}
