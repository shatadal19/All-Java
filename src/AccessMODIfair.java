class MyEmploy{
    private int id;
    private String name;
    public String getName(){
        return name;
    }
    public  void  setNmae(String n){
        name = n;
    }
   public void setId(int i){
        id = i;
   }
    public  int getId(){
        return id;
    }
}
public class AccessMODIfair {
    public static void main(String[] args) {
        MyEmploy Shatadal = new MyEmploy();
        //Shatadal.id = 58;
        //Shatadal.name = "Been";  ---> through an error due to privet;
        Shatadal.setNmae("ShatadalBiswas");
        System.out.println(Shatadal.getName());

    }
}
