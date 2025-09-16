import java.util.Scanner;
import java.lang.Math;
class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number-1: ");
       int num1 = sc.nextInt();
       System.out.print("Enter the number-2: ");
       int num2 = sc.nextInt();
       int tem =0;
       tem = num1;//4
       num1 = num2;//5
       num2 = tem;
       
       //num1 = num1+num2; //a=4+5 = 9
       //num2 = num1-num2 ; //b=4-5 = -1
       // num1 = num1-num2; //a=9-(-1) =10
       
       System.out.println(num1+" and "+ num2);
       
} }
