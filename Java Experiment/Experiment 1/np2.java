import java.util.Scanner;
//sum of 3 digit

public class np2{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);

System.out.print("Enter the number: ");
int num=scan.nextInt();

if(num>=100 && num<= 999){
int hundreds=num/100;
int tens=(num/10)%10;
int units=num%10;
int sum = hundreds + tens + units;

System.out.print("Sum of digits: " +sum);
}
else{
System.out.print("Please Enter a 3-digit Number. ");
}


}
}