class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }
}

class Car extends Vehicle {
    String model;

    Car(String brand, String model) {
        super(brand);  // constructor chaining
        this.model = model;
    }

    void display() {
        System.out.println("Brand: " + brand + ", Model: " + model);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Car c = new Car("Toyota", "Corolla");
        c.display();
    }
}