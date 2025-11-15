interface Engine {
    void engineType();
}

interface Wheels {
    void wheelType();
}

interface Bike extends Engine, Wheels {
    void brand();
}

class Honda implements Bike {
    public void engineType() {
        System.out.println("Engine Type: 4 Stroke Petrol Engine");
    }

    public void wheelType() {
        System.out.println("Wheel Type: Alloy Wheels");
    }

    public void brand() {
        System.out.println("Brand: Honda");
    }
}

public class InterfaceExample3 {
    public static void main(String[] args) {
        System.out.println("Name - Nishita, Roll no.- 24csu145\n");

        Honda h = new Honda();
        h.brand();
        h.engineType();
        h.wheelType();
    }
}
