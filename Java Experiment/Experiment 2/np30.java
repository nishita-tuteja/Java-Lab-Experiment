// Rhombus Pattern 
public class np30 {
    public static void main(String[] args) {
    
        System.out.println("Name: Nishita, Roll No: 24CSU145, Section: B\n");

        int rows = 5; 
        for (int i = 1; i <= rows; i++) {
            
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            
            for (int k = 1; k <= rows; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
