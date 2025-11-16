public class ExceptionWithFinally {
    public static void main(String[] args) {
        System.out.println("Name: Nishita, Roll No.: 24csu145\n");

        try {
            
            throw new Exception("This is a custom Exception message");
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            
            System.out.println("Finally block executed successfully!");
        }
    }
}
