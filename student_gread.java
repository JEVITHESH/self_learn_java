import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;

        while (true) {
            System.out.print("Enter the number (0 to exit): ");
            a = sc.nextInt();

            if (a == 0) {
                System.out.println("Exiting...");
                break; // stop loop
            }
            else if (a == 100) {
                System.out.println("0");
            }
            else if (a < 100 && a >= 90) {
                System.out.println("A+ Grade");
            }
            else if (a < 90 && a >= 80) {
                System.out.println("A Grade");
            }
            else if (a < 80 && a >= 70) {
                System.out.println("B+ Grade");
            }
            else if (a < 70 && a >= 60) {
                System.out.println("B Grade");
            }
            else if (a < 60 && a >= 50) {
                System.out.println("C Grade");
            }
            else {
                System.out.println("U Grade");
            }
        }
        sc.close();
    }
}
