public class varriableARgument {

    static  int sum(int ...arr){
        int result=0;
        for(int a: arr){
            result +=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("the sum is "+sum(7,9));
        System.out.println("the sum is "+sum(7,9,2));
        System.out.println("the sum is "+sum(7,9,8,10));
        System.out.println("the sum is "+sum(7,9,7,3,7));
    }
}


