import java.util.Scanner;

class Bike {   // Parent class
    String name;
    long price;
    String color;
    
    // Method overloading
    void so_details(String a, long b, String c){ 
        System.out.println("Name : " + a);
        System.out.println("price : " + b);
        System.out.println("color : " + c);
    }
    void so_details(String a, long b){ 
        System.out.println("Name : " + a);
        System.out.println("price : " + b);
    }
}

class Pulser extends Bike {  // Child class
    // Constructor overloading
    Pulser(String name, long price, String color){ 
        this.name = name;
        this.price = price * 2;
        this.color = color;
        so_details(name, this.price, color);
    }
    
    Pulser(String name, long price){ 
        this.name = name;
        this.price = price * 4; 
        so_details(name, this.price);
    }
}

public class Main {
    public static void main(String[] args) {
        Pulser p = new Pulser("MT", 15000, "black"); // passing values
    }
}
Name : MT
price : 30000
color : black

