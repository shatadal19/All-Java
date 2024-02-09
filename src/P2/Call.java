package P2;
class C_8_a  extends P1.cse {
    public static int number_of_student = 0;

    public C_8_a() {
        number_of_student++;
    }

    public static int getStudentcount() {

        return number_of_student;
    }
}
public class Call {
    public static void main(String[] args) {
        P2.C_8_a s = new C_8_a();
        s.setSection("A");
//        s.getSection();
        System.out.println(s.getSection());
    }


}
