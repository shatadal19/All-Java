import java.util.Scanner;
public class kloTomile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your kilo:");
        float a = sc.nextFloat();

        float b= 0.621371f;
        float mile =a * b;

        System.out.println("Killo to mile is"+mile);

    }
}
