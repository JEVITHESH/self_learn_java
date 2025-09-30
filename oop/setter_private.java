//setter is used for to assign the value for private value
class a {
    private int a = 5;
    void setter(int a){
        this.a = a;
    }  
    int get(){
        return a;
    }
    void display(){
        System.out.print(get());
    }
}

public class Main {
    public static void main(String[] args) {
        
    a obj = new a();
    obj.setter(50);
    obj.display();
}}
