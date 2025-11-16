import java.io.File;
import java.util.Scanner;
class CheckFileOrDirectory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the file or directory path: ");
        String path = scan.nextLine();
        File file = new File(path);
        if (file.exists()) {
            if (file.isFile()) {
                System.out.println("It is a file.");
            }
            else if (file.isDirectory()) {
                System.out.println("It is a directory.");
            }
        }
        else {
            System.out.println("Path does not exist.");
        }
        System.out.println("Nishita Tuteja 24CSU145");
    }
}