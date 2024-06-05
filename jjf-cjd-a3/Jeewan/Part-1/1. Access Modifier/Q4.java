// Access modifier public

class Q4 {
    public static void main(String[] args) {
        MyClass myObject = new MyClass();

        myObject.publicMethod();
    }
}

class MyClass {
    public void publicMethod() {
        System.out.println("This is a public method.");
    }
} 