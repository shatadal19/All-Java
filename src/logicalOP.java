public class logicalOP {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        if(a && b){
            System.out.println("T");
        }
        else {
            System.out.println("F");
        }
        boolean a1 = false;
        boolean b1 = false;
        if(a1 || b1){
            System.out.println("T");
        }
        else {
            System.out.println("F");

            System.out.println("Not(a) is "+!a);
            System.out.println("Not(b) is "+!b);
        }
    }
}
