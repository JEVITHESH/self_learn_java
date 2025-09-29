//"This" is used for to axcess the variable in constructor(method inside)from the parentclass
import  java.util.Scanner;
class Bike {   //parent class
    String name;
    long price;
    String color;
    
    void so_details(String a , long b , String c ){//method overloaading
        System.out.println("Name : "+ a);
        System.out.println("price : "+ b);
        System.out.println("color : "+ c);
    }
    void so_details(String a , long b ){//method overloaading
        System.out.println("Name : "+ a);
        System.out.println("price : "+ b);}
}

class Pulser extends Bike {  //child class
           Pulser(String name , long price){ //constructor overloaading
              this.name = name;
              this.price = price*4; 
              so_details(name,this.price);
           }
}


public class Main {
    public static void main(String[] args) {
        Pulser p = new Pulser("MT",15000);//passing the value
        
    }
}
