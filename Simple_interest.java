import java.util.Scanner;
import java.lang.Math;
class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter the Principal amount: ");
       double principal = sc.nextDouble();
       System.out.print("Enter rate of interest: ");
       double rate = sc.nextDouble();
       System.out.print("Enter time : ");
       double time = sc.nextDouble();
       System.out.println((principal*rate*time)/100);
       
} }
