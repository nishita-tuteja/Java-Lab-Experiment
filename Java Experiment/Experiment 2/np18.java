//vowelconsonent
public class np18 {
    public static void main(String[] args) {
        System.out.println("Name: Nishita, Roll No.: 24CSU145, Section: B");

        char ch = 'a'; 

        if (!Character.isLetter(ch)) {
            System.out.println("Not an alphabet");
        } else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}
