import java.util.*;
public class Main
{
	public static void main(String[] args) {
    Random r = new Random();
    int a = r.nextInt(10);
    Scanner sc = new Scanner(System.in);
    int num=0;
    while(a!=num){
	int num1 = sc.nextInt();
	num=num1;
    }
    System.out.print("You are the winner , yes the number is "+num);
	}
}
