import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of primes you want to print");
        int number = scanner.nextInt();
        if (number <= 0) {
            System.out.println("Please re-enter");
        } else {
            int check=2;
            int count = 1;
            while (count <= number) {
                boolean ok=true;
                int sqr=(int)Math.sqrt(check);
                for (int i = 2; i <= sqr; i++) {
                    if (check%i==0){
                        ok=false;
                    }
                }if (ok){
                        System.out.println(check);
                        count++;

            }check++;
            }
        }
    }
}

