import java.util.Scanner;
public class sub{
  public static void main(String[] args){
  int num,sum =0,s=0;
  System.out.println("Enter the number : ");
  Scanner sc = new Scanner(System.in);
  num = sc.nextInt();
  
  while(num>0){
    sum=num%10;
    num=num/10;
    s=sum+s;
  }
System.out.println(s);
  }
  
  
}
