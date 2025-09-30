//getter is used for to display the private value
class A {
    private int num = 10;

    int getNum() {       // Getter method
        return num;
    }
}

class B extends A {
    void display(){
        System.out.print(getNum()); // Access via getter
    }
}

public class Main {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
}
