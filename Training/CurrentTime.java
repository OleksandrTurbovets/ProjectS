public class CurrentTime {
    public static void main(String[] args) {
        long millis = System.currentTimeMillis();
        long seconds = millis/1000;
        long minutes = seconds/60;
        long hours = minutes/60;
        long days = hours/24;
        long years = days/365;
        System.out.println(years + ":" + days%365 + ":" + hours%24 + ":" + minutes%60 + ":" + seconds%60);
    }
}
