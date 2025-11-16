class MyCustomException extends Exception {
    private String message;

    public MyCustomException(String message) {
        this.message = message;
    }

    void printMessage() {
        System.out.println("Stored Message: " + message);
    }
}

public class CustomStringExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Name: Nishita, Roll No.: 24csu145\n");

        try {
            throw new MyCustomException("This is my custom exception message!");
        } catch (MyCustomException e) {
            e.printMessage();
        }
    }
}
