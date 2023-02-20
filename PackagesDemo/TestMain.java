package PackagesDemo;

public class TestMain {
    public static void main(String[] args) {
        PackagesDemoMain test1 = new PackagesDemoMain("Lukas","Computer Science","7344","123 Address");
        test1.PrintStudent();

        System.out.println(test1.getId());
        System.out.println(test1.getAddress());

        // setID() is private
        // test1.setID(1234);

        test1.setAddress("321 something Ave");
        System.out.println(test1.getAddress());

        System.exit(0);
    }
}
