class  Employee{
    int id;
    int salary;
    String name;
    public void PrintDitils(){
        System.out.println("My id is "+id);
        System.out.println("My name is "+name);
    }
    public int getSalary(){
        return  salary;
    }
}
public class OoB {
    public static void main(String[] args) {
        System.out.println("This is our custom cls");
        Employee shatadal = new Employee(); // Instantiating a new Employee object.
        shatadal.id=68;
        shatadal.name = "Been";
        shatadal.salary=5000;
        Employee jon = new Employee();
        jon.id=56;
        jon.name="jonny";
        jon.salary = 40000;
//        System.out.println(shatadal.id);
//        System.out.println(shatadal.name);
        shatadal.PrintDitils();
        jon.PrintDitils();
        int salary = jon.getSalary();
        int ssalary = shatadal.getSalary();
        System.out.println(salary);
        System.out.println(ssalary);
    }
}
