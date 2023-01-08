import java.util.Scanner;

public class bt3 {
    public static void main(String[] args) {
        System.out.println("prime number less than 100 is");
        int check = 2;
        while (check < 100) {
            int sqr = (int) Math.sqrt(check);
            boolean ok = true;
            for (int i = 2; i <= sqr; i++) {
                if (check % i == 0) {
                    ok = false;
                }
            }
            if (ok) {
                System.out.println(check);
            } check++;
        }
    }
}
