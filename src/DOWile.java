import java.util.Scanner;
public class DOWile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR NUMBER: ");
        int a = sc.nextInt();
//        while (a<=3){
//            System.out.println(a);
//            a++;
//        }
      do {
          System.out.println(a);
          a++;
      }while(a<5);
    }
}
