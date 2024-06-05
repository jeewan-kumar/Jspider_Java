public class MyClass {
    private int value;

    public static void performActionWithoutObject() {
        System.out.println("Performing an action without creating an object.");
    }

    public MyClass() {
        this(0); // Calls the one-argument constructor with a default value of 0
    }

    public MyClass(int value) {
        this.value = value;
    }

    public MyClass(int value1, int value2) {
        this.value = value1 + value2;
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        performActionWithoutObject(); // Call a method without creating an object

        MyClass obj1 = new MyClass();              // Calls the no-argument constructor
        MyClass obj2 = new MyClass(10);            // Calls the constructor with one parameter
        MyClass obj3 = new MyClass(5, 7);          // Calls the constructor with two parameters

        System.out.println("obj1 value: " + obj1.getValue()); // Should print 0
        System.out.println("obj2 value: " + obj2.getValue()); // Should print 10
        System.out.println("obj3 value: " + obj3.getValue()); // Should print 12
    }
}
