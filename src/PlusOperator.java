public class PlusOperator {
    int addThreeIntegers(int i, int j, int k) {
        return i + j + k;
    }
    String concatenateString(String inputString) {
        return inputString + " Northern University Bangladesh";
    }

    public static void main(String[] args) {
        PlusOperator operator = new PlusOperator();

        // Function 1: Add three integer numbers
        int result1 = operator.addThreeIntegers(123, 45, 26);
        System.out.println("Sum of three integers are: " + result1);

        // Function 2: Concatenate a string with "Northern University Bangladesh"
        String result2 = operator.concatenateString("Welcome to");
        System.out.println("Concatenated is: " + result2);
    }
}
