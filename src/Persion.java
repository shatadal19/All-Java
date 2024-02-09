//Lab task 2 and 3
import java.util.Scanner;
class student {
    private String name;
    private  int id;

    public static int personCounter = 0;

    public student() {
        personCounter++;
    }

    public void getinfo() {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
    }

    public void setInfoFromInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        this.name = scanner.nextLine();

        System.out.print("Enter ID: ");
        this.id = scanner.nextInt();
    }


    public static int getPersonCounter(){
        return personCounter;
    }


}



public class Persion {
    public static void main(String[] args) {
        System.out.println("This is Lab 02");
        student student1 =new student();
        student1.setInfoFromInput();
        student student2 =new student( );
        student2.setInfoFromInput();
        student1.getinfo();
        student2.getinfo();
        System.out.println("TOtal student : "+student.getPersonCounter());


    }
}

