import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int ex = sc.nextInt();
        int ans =1;
        for(int i = 1 ; i <= ex ;i++){
            ans = ans*base;
        }
        System.out.print(ans);
}}
