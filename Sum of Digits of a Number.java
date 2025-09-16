class Main {
    public static void main(String[] args) {
        int a = 45;
        int m=0;
        while (a > 0) {
            int digit = a % 10;   // get last digit
            System.out.println(digit);
           m+=digit;
            a /= 10;// remove last digit
            //System.out.println(a);
        }
       System.out.println(m);
    }
}
