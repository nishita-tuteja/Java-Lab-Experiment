class BaseException extends Exception {}
class MidLevelException extends BaseException {}
class TopLevelException extends MidLevelException {}

class A {
    void display() throws BaseException {
        throw new BaseException();
    }
}

class B extends A {
    void display() throws MidLevelException {
        throw new MidLevelException();
    }
}

class C extends B {
    void display() throws TopLevelException {
        throw new TopLevelException();
    }
}

public class MultiLevelExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Name: Nishita, Roll No.: 24csu145\n");

        A obj = new C(); 
        try {
            obj.display();
        } catch (TopLevelException e) {
            System.out.println("Caught TopLevelException!");
        } catch (MidLevelException e) {
            System.out.println("Caught MidLevelException!");
        } catch (BaseException e) {
            System.out.println("Caught BaseException!");
        }
    }
}
