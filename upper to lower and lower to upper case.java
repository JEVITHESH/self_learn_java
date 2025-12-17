import java.util.*;
public class Main
{
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	char num1 = sc.next().charAt(0);
	if('a'<=num1 && num1 <='z'){
	    num1-=32;
	     
	}
	else if('A'<=num1 && num1 <='Z'){
	    num1+=32;
	}
	else{
	    System.out.print("Speial Character");
	}
    System.out.print(num1);
	}
}
