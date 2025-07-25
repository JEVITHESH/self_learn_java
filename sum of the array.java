import java.util.Scanner;
public class sub{
  public static void main(String[] args){
  int num,sum =0,s=0;
  int[] arr = {1,2,3,4,5};
  //System.out.println("Enter the number : ");
  //Scanner sc = new Scanner(System.in);
  //num = sc.nextInt();
  int len = arr.length;
  for(int i=0;i<len;i++){
     sum=sum+arr[i];
  }
  System.out.println(sum);

  }
  
  
}
