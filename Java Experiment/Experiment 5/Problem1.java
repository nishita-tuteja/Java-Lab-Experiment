public class Problem1 {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.printShape();       // From Shape
        sq.printRectangle();   // From Rectangle
        sq.printSquare();      // From Square
    }
}

class Shape {
    void printShape() {
        System.out.println("This is shape");
    }
}

class Rectangle extends Shape {
    void printRectangle() {
        System.out.println("This is rectangular shape");
    }
}

class Circle extends Shape {
    void printCircle() {
        System.out.println("This is circular shape");
    }
}

class Square extends Rectangle {
    void printSquare() {
        System.out.println("Square is a rectangle");
    }
}
