import java.util.Scanner;
class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the size of the array : ");
       int size = sc.nextInt();
       int[] arr = new int[size];
       for(int i =0 ; i < size ; i++){
           arr[i] = sc.nextInt();
       }
       System.out.print("Enter the target number from the array : ");
       int t = sc.nextInt();
       int j  = 1;
       for(int i = 0 ; i < size ; i++){
           if(t == arr[i]){
               System.out.print("The number is on "+j +" in the array");
               
           }
           else{
               System.out.print(t+" not in the array");
           }
           j++;
           }
    }
}
Enter the array size : 5
  2 3 4 5 6 
Enter the targat number : 5
  4
