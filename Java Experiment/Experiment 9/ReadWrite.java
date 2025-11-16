import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
class ReadWrite {
    public static void main(String[] args) {
        String fileName = "example.txt";
        try {
            FileWriter writer = new FileWriter(fileName); //write
            writer.write("Hello, this is a simple write operation.\n");
            writer.write("File handling in Java is easy!");
            writer.close();
            System.out.println("Data written successfully.");
            FileReader reader = new FileReader(fileName); //read
            int ch;
            System.out.println("Reading file content:");
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();
        }
        catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        finally {
            System.out.println("\n Nishita Tuteja 24CSU145");
        }
    }
}