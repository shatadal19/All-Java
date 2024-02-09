//// Base class
//class Shape {
//    void drawShape() {
//        System.out.println("Drawing a generic shape");
//    }
//}
//
//// Derived class 1
//class Circle extends Shape {
//    @Override
//    void drawShape() {
//        System.out.println("Drawing a circle");
//    }
//
//    void specificCircleMethod() {
//        System.out.println("Performing specific circle operation");
//    }
//}
//
//// Derived class 2
//class Square extends Shape {
//    @Override
//    void drawShape() {
//        System.out.println("Drawing a square");
//    }
//
//    void specificSquareMethod() {
//        System.out.println("Performing specific square operation");
//    }
//}
//
//public class Area {
//    public static void main(String[] args) {
//        Circle circle = new Circle();
//        Shape shape = circle;
//        shape.drawShape();
//        if (shape instanceof Circle) {
//            Circle originalCircle = (Circle) shape;
//            originalCircle.specificCircleMethod();
//        }
//    }
//}