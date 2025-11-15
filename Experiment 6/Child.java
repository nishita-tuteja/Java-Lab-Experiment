interface I1 {
    void method1();
}


interface I2 {
    void method2();
}


class Parent {
    void show() {
        System.out.println("Parent class method");
    }
}


public class Child extends Parent implements I1, I2 {


    Child() {
        System.out.println("Nishita 24csu145 Sec B");
    }

 
    public void method1() {
        System.out.println("I1 implemented");
    }

        public void method2() {
        System.out.println("I2 implemented");
    }
public static void main(String[] args) {
        Child c = new Child();
        c.show();
        c.method1();
        c.method2();
    }
}
