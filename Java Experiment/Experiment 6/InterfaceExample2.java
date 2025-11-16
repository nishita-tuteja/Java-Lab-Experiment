interface Vehicle {
    void start();
}

interface Car extends Vehicle {
    void drive();
}

class Tesla implements Car {
    public void start() {
        System.out.println("Tesla car started.");
    }

    public void drive() {
        System.out.println("Tesla car is driving.");
    }
}

public class InterfaceExample2 {
    public static void main(String[] args) {
        System.out.println("Name - Nishita, Roll no.- 24csu145\n");

        Tesla t = new Tesla();
        t.start();
        t.drive();
    }
}
