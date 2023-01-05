import java.util.Scanner;

public class bt1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("select the picture you want to draw");
        int select = -1;
        System.out.println("1" + " + " + "rectangular");
        System.out.println("2" + " + " + "Print a right triangle, with right angles at botton left");
        System.out.println("3" + " " + "Prints a right triangle, with right angles on the top-left");
        while (true) {
            select = input.nextInt();
            switch (select) {
                case 1: for(int i = 1; i <=3; i++){
                    for(int j = 1; j <= 7; j++) {
                        System.out.print("*  ");
                    }System.out.println("");
                }break;
                case 2:
                    for (int i = 1; i <= 7; ++i) {
                        for (int j = 1; j <= i; ++j) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }break;
                case 3:
                    for (int i = 7; i>=1; i--) {
                        for (int j = 1; j <=i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
            }
        }
    }
}
