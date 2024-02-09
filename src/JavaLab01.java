/*
Java have defolt constructor and distructor,
 but we use constructor because of multiple input
*/

public class JavaLab01 {
    public String name;
    public int id;
    JavaLab01(int i,String n){
        this.id = i;
        this.name = n;

    }

    public void studentDitils(){
        System.out.println("Id is "+id+"\nname is "+name);
    }
    public static void main(String[] args) {

        System.out.println("I am java class");
        JavaLab01 stduent = new JavaLab01(1586,"shatadal");
//        stduent.name = "Shatadal";
//        stduent.id = 41125;
        stduent.studentDitils();

    }
}