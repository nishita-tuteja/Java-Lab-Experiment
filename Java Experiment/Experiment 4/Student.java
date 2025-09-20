public class Student {
    String name;
    int roll_no;

    // Constructor
    Student(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }

    void display() {
        System.out.println("Student Name: " + name + ", Roll No: " + roll_no);
    }

    public static void main(String[] args) {
        System.out.println("Name - Nishita  Roll no - 24csu145  Sec - B\n");

        Student s = new Student("John", 2);
        s.display();
    }
}
