class  aktaclass{
    int a;

    public int getA() {
        return a;
    }

    aktaclass(int a){
        this.a = a;

    }
    public  int return1(){
        return 1;
    }
}
class arekclass extends aktaclass{
    arekclass(int c){
        super((c));
        System.out.println("I am a constructor");
    }
}
public class ThisSuper {
    public static void main(String[] args) {
        aktaclass b = new aktaclass(79);
        arekclass c = new arekclass(86);
        System.out.println(b.getA());
//        System.out.println(c.getA());
    }
}
