import java.util.Scanner; public class Practical_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); System.out.println("Enter distance in meter:"); float meter = sc.nextFloat(); System.out.print("Hour:");
        float hrs = sc.nextFloat(); System.out.print("Minutes:"); float min = sc.nextFloat(); System.out.print("Seconds:"); float sec = sc.nextFloat();
        float time = hrs*3600 + min*60 + sec; float dis = meter/time;
        System.out.println("Distance in meter: "+ dis+ " m/s");
        float hours = hrs + (min/60) + (sec/3600); float kilo = meter/1000;
        float d = kilo/hours;
        System.out.println("Distance in kilometer: "+d + " km/hr");
        float miles = meter/1609; float distance = miles/hours;
        System.out.println("Distance in miles: " + distance+" miles/hr");


    }
}
