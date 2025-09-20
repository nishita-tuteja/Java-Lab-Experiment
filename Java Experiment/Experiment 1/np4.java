public class np4 {
    public static void main(String[] args) {
        int minutes = 525600; 

        int totalDays = minutes / (60 * 24);       
        int years = totalDays / 365;               
        int remainingDaysAfterYears = totalDays % 365;
        int months = remainingDaysAfterYears / 30; 
        int days = remainingDaysAfterYears % 30;   
        System.out.println("Years: " + years);
        System.out.println("Months: " + months);
        System.out.println("Days: " + days);
    }
}