class Base1{
    Base1(){
        System.out.println("I am a constructor");
    }
    Base1(int a){
        System.out.println("I am a constructor with value of as "+ a);
    }

}
class Derived extends Base1{
    Derived(){
        super(0);
        System.out.println("I am a derived class");
    }

}

public class ConsInhei {
    public static void main(String[] args) {
        //Base1 b = new Base1();
        //b.setX(879);
        //System.out.println(b.getX());
        Derived d = new Derived();

    }
}
