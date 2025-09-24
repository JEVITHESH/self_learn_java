public class ManagementOverload {
    String name;
    int mark;

    // Constructor 1
    ManagementOverload() {
        name = "Unknown";
        mark = 0;
        System.out.println("Constructor 1 -> Name: " + name + ", Marks: " + mark);
    }

    // Constructor 2
    ManagementOverload(String a, int b) {
        name = a;
        mark = b;
        System.out.println("Constructor 2 -> Name: " + name + ", Marks: " + mark);
    }

    // Constructor 3
    ManagementOverload(int b) {
        name = "Student";
        mark = b;
        System.out.println("Constructor 3 -> Name: " + name + ", Marks: " + mark);
    }

    public static void main(String[] args) {
        ManagementOverload m1 = new ManagementOverload();           // Calls Constructor 1
        ManagementOverload m2 = new ManagementOverload("Alex", 90); // Calls Constructor 2
        ManagementOverload m3 = new ManagementOverload(95);         // Calls Constructor 3
    }
}
