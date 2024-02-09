class c1{
    public int x = 5;
    protected  int y = 45;
    int z = 6;
    private int a = 78;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void math1(){
        System.out.println(x);
    }
}
class c2{

}

public class AccessModifairs {
    public static void main(String[] args) {
        c1 c = new c1();
        c.math1();
    }
}
