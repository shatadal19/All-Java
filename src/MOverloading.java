public class MOverloading {
   static  void foo(){
       System.out.println("Good moring bro");
   }
   static  void foo(int a){
       System.out.println("Good moring "+a+" bro");
   }
   static  void foo(int a, int b){
       System.out.print("Good moring "+a+" bro ");
       System.out.println("Good moring "+b+" bro");
   }

    static  void telljokes(){
       System.out.println("I invented a new word\n"+"Plagiarism");
   }
   static void change(int a){
       a = 98;
   }
   static void change2(int [] arr){
       arr[0] = 98;
       arr[1] = 99;
   }
    public static void main(String[] args) {
//       telljokes();
        //int [] marks= {52, 73, 77, 89, 98, 94};
//        //-- Changing the int
//        int x = 45;
//        change(x);
//        System.out.println("The value of X after running change is: "+x);

        //--- Changing on array

//        change2(marks);
//        System.out.println("The value of X after running change is: "+marks[0]);
//        System.out.println("The value of X after running change is: "+marks[1]);
        foo();
        foo(300);
        foo(300,400);
    }
}
