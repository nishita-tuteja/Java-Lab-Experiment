import java.io.*;
class BufferredFile {
    public static void main(String[] args) {
        String fileName = "students.txt";
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write("S.No\tName\tCGPA\tGrade\n");
            writer.write("1\tNeha\t8.7\tA+\n");
            writer.write("2\tRiya\t9.1\tA+\n");
            writer.write("3\tAmit\t7.5\tB+\n");
            writer.close();
            System.out.println("Student details written successfully.");
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            System.out.println("Contents of the file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        }
        catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        finally {
            System.out.println("Nishita Tuteja 24CSU145");
        }
    }
}