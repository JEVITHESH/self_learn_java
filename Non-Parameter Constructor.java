public class ManagementNonParam {
    String name;
    int mark;

    // Non-parameter constructor
    ManagementNonParam() {
        name = "Jevithesh";
        mark = 95;
        System.out.println("Name: " + name + ", Marks: " + mark);
    }

    public static void main(String[] args) {
        ManagementNonParam m1 = new ManagementNonParam();
    }
}
