interface samples{
    void math1();
    void math2();
}
interface childsample extends samples{
//    void math1();
//    void math2();
    void math3();
    void math4();

}
class mysampleclass implements childsample,samples{


    public void math1(){
        System.out.println("Math1");
    }
    public void math2(){
        System.out.println("Math2");
    }
    public void math3(){
        System.out.println("Math3");
    }
    public void math4(){
        System.out.println("mathe4");
    }

}
public class INheriininterface {
    public static void main(String[] args) {
        mysampleclass s = new mysampleclass();
        s.math1();
        s.math2();
        s.math3();
        s.math4();

    }
}
