import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
       if(('A' <= ch && ch <= 'Z') || ('a' <= ch && ch <= 'z')){
           System.out.print("It is alphabete");
       }
       else if('0'<= ch && ch <= '9'){
            System.out.print("It is number");
       }
       else{
            System.out.print("It is Special Character");
       }
}}
