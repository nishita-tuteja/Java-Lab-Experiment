//FibonacciSeries
import java.util.Scanner;

public class np24 {
    public static void main(String[] args) {
System.out.println("Name: Nishita, Roll No.: 24CSU145, Section: B");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int a = 0, b = 1;
        System.out.print("Fibonacci Series: " + a + " " + b);
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}
