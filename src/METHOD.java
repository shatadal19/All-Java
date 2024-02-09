public class METHOD {
//   static int logic(int x, int y){
//       int z;
//       if (x>y){
//           z=x+y;
//       }
//       else {
//           z = (x+y)*5;
//       }
//       return z;
        int logic(int x, int y){
       int z;
       if (x>y){
           z=x+y;
       }
       else {
           z = (x+y)*5;
       }
       return z;
   };
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c ;
        //c=logic(a,b);
        METHOD obj = new METHOD();
        c = obj.logic(a,b);

        System.out.println(c);


    }

}


