//root of quadratic equations
public class np17 {
    public static void main(String[] args) {
        System.out.println("Name: Nishita, Roll No.: 24CSU145, Section: B");

        double a = 1, b = -3, c = 2;

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double r1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double r2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Real and Distinct roots: " + r1 + ", " + r2);
        } else if (discriminant == 0) {
            double r = -b / (2 * a);
            System.out.println("Real and Equal roots: " + r);
        } else {
            double real = -b / (2 * a);
            double imag = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Complex roots: " + real + " + " + imag + "i and " + real + " - " + imag + "i");
        }
    }
}
