import java.util.Scanner;
//reverse array

public class np14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

               System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] original = new int[n];
        int[] reversed = new int[n];

               System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            original[i] = scanner.nextInt();
        }

                for (int i = 0; i < n; i++) {
            reversed[i] = original[n - 1 - i];
        }

       
        System.out.print("Reversed array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(reversed[i] + " ");
        }

        scanner.close();
    }
}
