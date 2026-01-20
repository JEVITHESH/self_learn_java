import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sq = n * n;

       
        int count = 0;
        int temp = n;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        int power = 1;
        for (int i = 0; i < count; i++) {
            power *= 10;
        } 

        int rightPart = sq % power;
        int leftPart = sq / power;

        if (leftPart + rightPart == n) {
            System.out.println("Kaprekar Number");
        } else {
            System.out.println("Not a Kaprekar Number");
        }
    }
}
