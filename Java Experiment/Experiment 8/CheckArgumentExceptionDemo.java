class CheckArgumentException extends Exception {
    public CheckArgumentException(String message) {
        super(message);
    }
}

public class CheckArgumentExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Name: Nishita, Roll No.: 24csu145\n");

        try {
                        if (args.length < 5) {
                throw new CheckArgumentException("Less than 5 arguments passed!");
            }

                        int sum = 0;
            for (int i = 0; i < 5; i++) {
                sum += Integer.parseInt(args[i]);
            }

                        System.out.println("Sum of 5 integers = " + sum);
        } catch (CheckArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Please enter only integer values!");
        }
    }
}
