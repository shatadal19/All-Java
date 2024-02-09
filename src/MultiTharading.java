class MyTherad extends Thread{

    @Override
    public void run(){
        int i = 0;
        while (i<10){
            System.out.println("I am happy");
        }
    }
}
class MyTherad2 extends Thread{

    @Override
    public void run(){
        int i = 0;
        while (i<12){
            System.out.println("I am sad");
            i++;
        }
    }
}
public class MultiTharading {
    public static void main(String[] args) {
        MyTherad t1 = new MyTherad();
        MyTherad2 t2 = new MyTherad2();
        t1.start();
        t2.start();
    }
}