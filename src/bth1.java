import java.util.Scanner;

public class bth1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter number ");
        int number = scanner.nextInt();
        if (number < 2) {
            System.out.println("not is prime");
        } else {
            int i = 2;
            boolean check=false;
            while (i<number){
                if (number % i == 0) {
                    check = true;
                    break;
                } i++;

            }if (check){
                System.out.println(number + " "+"is not prime");
        }else {
                System.out.println(number + " "+"is a prime");
            }

        }
    }
}
