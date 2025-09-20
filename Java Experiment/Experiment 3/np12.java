import java.util.Scanner;
//search and print index of element in array
public class np12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
System.out.print("Enter element to search: ");
        int target = scanner.nextInt();
        boolean found = false;
 for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }
if (!found) {
            System.out.println("Element not found.");
        }
        scanner.close();
    }
}