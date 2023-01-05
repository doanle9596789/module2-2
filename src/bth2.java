import java.util.Scanner;

public class bth2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double money=1.0;
        int month=1;
        double interestRate = 1.0;
        System.out.println("Enter required information");
        System.out.println("deposits");
        money=scanner.nextDouble();
        System.out.println("Enter the number of months");
        month=scanner.nextInt();
        System.out.println("Enter annual interest rate in percentage:");
        interestRate=scanner.nextDouble();
        double result=0;
        for (int i = 0; i < month; i++) {
            result += money * (interestRate/100)/12 * month;
            
        }
        System.out.println("the amount to be paid is" + " " + result);
    }
}
