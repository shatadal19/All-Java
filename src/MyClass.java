public class MyClass {
    private int myVariable;

    public MyClass(int value) {
        // You can access and initialize the private variable in the constructor
        myVariable = value;
    }

    public int getMyVariable() {
        return myVariable;
    }

    public static void main(String[] args) {
        // You can create an instance of the class and call the constructor
        MyClass myObject = new MyClass(42);
        int value = myObject.getMyVariable();
        System.out.println("MyVariable is: " + value);
    }
}
