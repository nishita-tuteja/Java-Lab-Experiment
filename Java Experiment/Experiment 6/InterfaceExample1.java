interface Printable {
    void print();
}

interface Showable {
    void show();
}

class Person {
    void displayInfo() {
        System.out.println("This is a Person class.");
    }
}

class Student extends Person implements Printable, Showable {
    public void print() {
        System.out.println("Printing student details...");
    }

    public void show() {
        System.out.println("Showing student details...");
    }
}

public class InterfaceExample1 {
    public static void main(String[] args) {
        System.out.println("Name - Nishita, Roll no.- 24csu145\n");

        Student s = new Student();
        s.displayInfo();
        s.print();
        s.show();
    }
}
