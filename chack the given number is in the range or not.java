import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int low = 5;int high = 15;
        if(low <= num1 && num1 <= high){
            System.out.print("number in the range");
        }
        else{
        System.out.println("number not in the range");
    }
}}
