abstract class Shape {
    abstract void RectangleArea(double length, double breadth);
    abstract void SquareArea(double side);
    abstract void CircleArea(double radius);
}

public class AreaCalculation extends Shape {

    public void RectangleArea(double length, double breadth) {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    public void SquareArea(double side) {
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }

    public void CircleArea(double radius) {
        double area = 3.14159 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    public static void main(String[] args) {
                System.out.println("Name: Nishita, Rollno. 24csu145");
               AreaCalculation obj = new AreaCalculation();

               obj.RectangleArea(5, 10);
        obj.SquareArea(4);
        obj.CircleArea(3);
    }
}
