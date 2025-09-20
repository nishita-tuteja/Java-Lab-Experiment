import java.util.Scanner;

public class np5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int number = scanner.nextInt();

        if (number < 100 || number > 999) {
            System.out.println("Error: Please enter a valid 3-digit number.");
        } else {
            int hundreds = number / 100;
            int tens = (number / 10) % 10;
            int units = number % 10;

            int reversed = (units * 100) + (tens * 10) + hundreds;

            System.out.println("Reversed number: " + reversed);
        }

        scanner.close();
    }
}
