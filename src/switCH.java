import java.util.Scanner;
public class switCH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        int a = sc.nextInt();

        switch (a){
            case 18:
                System.out.println("You are going to addult");
                break;
            case 21:
                System.out.println("You going to  join a job");
                break;
            case 60:
                System.out.println(" you going to reterd");
                break;
            default:
                System.out.println("Enjoy your life");
        }
    }
}
