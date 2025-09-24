public class Management {
    String name;
    int mark;

    // Default constructor
    Management() {
        name = "Jevithesh";
        mark = 95;
        System.out.println("Name: " + name + ", Marks: " + mark);
    }

    public static void main(String[] args) {
        Management m1 = new Management();
    }
}
//output
//Name: Jevithesh
//Mark: 95
