class One{
    public void great(){
        System.out.println("Good Morning!");
    }
    public void name(){
        System.out.println("My name is java");
    }
}
class  Two extends One {
    public void sagotom(){
        System.out.println("Sagotom>>");
    }
    public void name(){
        System.out.println("My name is java in class 2");
    }
}
public class DynamicMEthoDDispuS {
    public static void main(String[] args) {
        One ob = new One();
        Two obj = new Two();
        ob.name();
//      One ob1 = new Two(); --> This is possible. Becasue of Two is child class. But Two ar kono new object ba method use hobe na
//      Two obj1 = new One(); --> This is not possible. Beaucse of One is child class.
    }
}
