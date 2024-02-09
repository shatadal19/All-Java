class A{
    public int sh(){
        return 4;
    }
    public  void meth2(){
        System.out.println("I am method 2");
    }
}
class B extends A{
    @Override
    public  void meth2(){
        System.out.println("I am method 2 copy");
    }
    public  void meth3(){
        System.out.println("I am method 3");
    }
}
public class MethodOverrriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();
        B b = new B();
        b.meth2();
    }
}
