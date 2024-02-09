public class Operators {
    public static void main(String[] args) {
//         Arithmetic operator

        int a = 4;
        int b = 6 + a;
        System.out.println(b);
        int c = 6 - a;
        System.out.println(c);
        int d = 6 % a;
        System.out.println(d);
//        Assignment Operator
        int e = 9;
//        e += 3;
        e *= 3;
        System.out.println(e);
//        Comparison Operator
        System.out.println(6==8);
        System.out.println(6==6);
        System.out.println(6>4);
        System.out.println(6>=4);
        System.out.println(6<4);
        System.out.println(6<=4);
//        logical Operator
        System.out.println(64>5 && 64>8);
        System.out.println(64<5 && 64>8);
        System.out.println(64>5 || 64>8);
        System.out.println(64<5 || 64>8);
        System.out.println(64<5 || 64<8);
//        Bitwise operator
        System.out.println(2&3);


    }
}
