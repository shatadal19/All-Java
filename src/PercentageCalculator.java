import java.util.Scanner;
public class PercentageCalculator {
    public static void main(String[] args) {
        System.out.println(" Enter your marks: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number of sub1: ");
        float a = sc.nextFloat();
        System.out.println("Enter your number of sub1: ");
        float b = sc.nextFloat();
        System.out.println("Enter your number of sub1: ");
        float c = sc.nextFloat();
        System.out.println("Enter your number of sub1: ");
        float d = sc.nextFloat();
        System.out.println("Enter your number of sub1: ");
        float e = sc.nextFloat();
        float sum = a+b+c+d+e;
        float persentge = (sum/50);
        System.out.println(persentge);


    }
}
