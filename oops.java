
class v{
    String name;
    int years;
     void weels(){
      System.out.print("weels");
    }
}
class car extends v{
    car(){name = "susukey";
    years = 15;}
    @Override
    void weels(){
      System.out.print("4 weels");
    }
    void start(){
        System.out.println("stated");
    }
}
class bike extends car {
  bike(){
    name = "pulser";
    years = 5;}
    @Override
    void weels(){
      System.out.print("2 weels");
    }
}
public class Main {
    public static void main(String[] args) {
        bike b1 = new bike();
        System.out.println("Bike name: " + b1.name);
        System.out.println("Bike age: " + b1.years);
        
        b1.start();
        b1.weels(); 
    }
}
