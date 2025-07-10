import java.util.*;
public class sub {
   static Scanner scanner = new Scanner(System.in);
     public static void main(String[] args) {
       System.out.print("Enter the numer of food items: ");
       int no = scanner.nextInt();
       scanner.nextLine();
       String[] food = new String[no];
        for(int i = 0 ; i < no;i++){
         
          System.out.print("Enter the # food : ");
          food[i] = scanner.nextLine();
        }
         
          

        for(String foods : food){
         System.out.print(foods);
        }
     }}


