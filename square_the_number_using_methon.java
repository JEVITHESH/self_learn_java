import java.util.Scanner;
class Main {
    public static int sqe(int n){
        return n*n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.print(sqe(n));
             
         }
        
    }
//output
//Enter the Number : 5
//25
