import java.util.Scanner;
import java.lang.Math;
class Main {
    
    public static void main(String[] args) {
       System.out.print("Entee the radius of the circle : ");
       Scanner sc = new Scanner(System.in);
       int radus = sc.nextInt();
       System.out.println(Math.PI*(int)Math.pow(radus,2));
    }
} 
