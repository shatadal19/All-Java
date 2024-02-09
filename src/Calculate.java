public class Calculate {
    void Sum() {
        System.out.println("Function 1: Sum of two integers is not specified.");
    }
    int Sum(int a) {
        return a;
    }
    int Sum(int a, int b) {
        return a + b;
    }
    double Sum(double a, double b) {
        return a + b;
    }
    double Sum(int a, double b) {
        return a + b;
    }
    float Sum(float a, float b, float c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculate calcu = new Calculate();


        calcu.Sum();

        int result2 = calcu.Sum(49);
        System.out.println("Function 2: Sum of an integer: " + result2);

        int result3 = calcu.Sum(32, 71);
        System.out.println("Function 3: Sum of two integers: " + result3);

        double result4 = calcu.Sum(24.5, 38.5);
        System.out.println("Function 4: Sum of two doubles: " + result4);

        double result5 = calcu.Sum(54, 26.5);
        System.out.println("Function 5: Sum of an integer and a double: " + result5);

        float result6 = calcu.Sum(12.2f, 29.3f, 35.5f);
        System.out.println("Function 6: Sum of three floats: " + result6);
    }
}
