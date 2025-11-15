abstract class Marks {
    abstract double getPercentage();
}

class A extends Marks {
    int sub1, sub2, sub3;

    A(int s1, int s2, int s3) {
        sub1 = s1;
        sub2 = s2;
        sub3 = s3;
    }

    double getPercentage() {
        return (sub1 + sub2 + sub3) / 3.0;
    }
}

class B extends Marks {
    int sub1, sub2, sub3, sub4;

    B(int s1, int s2, int s3, int s4) {
        sub1 = s1;
        sub2 = s2;
        sub3 = s3;
        sub4 = s4;
    }

    double getPercentage() {
        return (sub1 + sub2 + sub3 + sub4) / 4.0;
    }
}

public class StudentMarks {
    public static void main(String[] args) {
                System.out.println("Name: Nishita, Rollno. 24csu145");
                A studentA = new A(85, 90, 78);
        B studentB = new B(80, 75, 88, 92);

        System.out.println("Student A Percentage: " + studentA.getPercentage() + "%");
        System.out.println("Student B Percentage: " + studentB.getPercentage() + "%");
    }
}
