import java.io.File;
class ChangeFilePermissions {
    public static void main(String[] args) {
        File file = new File("check.txt");
        System.out.println("Can Read: " + file.canRead());
        System.out.println("Can Write: " + file.canWrite());
        if (file.exists()) {
            boolean result = file.setWritable(false);
            if (result) {
                System.out.println("File permission changed");
            }
            else {
                System.out.println("Failed to change file permission.");
            }
        }
        else {
            System.out.println("File does not exist.");
        }

        System.out.println("Can Read: " + file.canRead());
        System.out.println("Can Write: " + file.canWrite());
        System.out.println("Nishita Tuteja 24CSU145");
    }
}