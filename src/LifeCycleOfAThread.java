class MytheradRunable3 implements Runnable{
    public void run(){
        System.out.println("I am a therad 1");
        System.out.println("I am a therad 1");
        System.out.println("I am a therad 1");
        System.out.println("I am a therad 1");
        System.out.println("I am a therad 1");
        System.out.println("I am a therad 1");
        System.out.println("I am a therad 1");
        System.out.println("I am a therad 1");
        System.out.println("I am a therad 1");
        System.out.println("I am a therad 1");
        System.out.println("I am a therad 1");
        System.out.println("I am a therad 1");
        System.out.println("I am a therad 1");
        System.out.println("I am a therad 1");
        System.out.println("I am a therad 1");
    }
}
class MytheradRunable4 implements Runnable{
    public void run(){
        System.out.println("I am a therad 2");
        System.out.println("I am a therad 2");
        System.out.println("I am a therad 2");
        System.out.println("I am a therad 2");
        System.out.println("I am a therad 2");
        System.out.println("I am a therad 2");
        System.out.println("I am a therad 2");
        System.out.println("I am a therad 2");
        System.out.println("I am a therad 2");
        System.out.println("I am a therad 2");
        System.out.println("I am a therad 2");
        System.out.println("I am a therad 2");
        System.out.println("I am a therad 2");
        System.out.println("I am a therad 2");
        System.out.println("I am a therad 2");
        System.out.println("I am a therad 2");
    }
}
public class LifeCycleOfAThread {
    public static void main(String[] args) {
        MytheradRunable1 bulate1 = new MytheradRunable1();
        Thread gun1 = new Thread(bulate1);
        MytheradRunable2 bulate2 = new MytheradRunable2();
        Thread gun2 = new Thread(bulate2);
        gun1.start();
        gun2.start();
    }
}
