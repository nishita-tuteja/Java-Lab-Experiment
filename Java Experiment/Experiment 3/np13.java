import java.util.Scanner;
//sum of all and alternate elements of array
public class np13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
int totalSum = 0;
int alternateSum = 0;
for (int i = 0; i < n; i++) {
            totalSum += arr[i];
            if (i % 2 == 0) {
                alternateSum += arr[i];
            }
        }

        System.out.println("Sum of all elements: " + totalSum);
        System.out.println("Sum of alternate elements (even indices): " + alternateSum);

        scanner.close();
    }
}