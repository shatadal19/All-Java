class Base{
    int x;
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void printMe(){
        System.out.println("I am a constructor");
    }
}
class  Dreived extends Base{
   public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        System.out.println("I am in base setting x now");
        this.y = y;
    }
}
public class INheriTace {
    public static void main(String[] args) {
        Base s  = new Base();
        s.setX(568);
        s.getX();
        System.out.println(s.getX());
        Dreived d = new Dreived();
        d.setX(46);
        System.out.println(d.getX());
        d.setY(456);
        System.out.println(d.getY());;

    }
}