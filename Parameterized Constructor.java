public class ManagementParam {
    String name;
    int mark;

    // Parameterized constructor
    ManagementParam(String a, int b) {
        name = a;
        mark = b;
        System.out.println("Parameterized Constructor -> Name: " + name + ", Marks: " + mark);
    }

    public static void main(String[] args) {
        ManagementParam m1 = new ManagementParam("Jevi", 85);
    }
}
