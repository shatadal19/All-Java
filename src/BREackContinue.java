public class BREackContinue {
    public static void main(String[] args) {
        for(int i=0; i<5; i++){

//            System.out.print(i);
//            System.out.println(". Java is great");
            if(i==2){
                System.out.println("For loop ending");
//                break;
                continue;

            }
            System.out.print(i);
            System.out.println(". Java is great");

        }

    }
}
