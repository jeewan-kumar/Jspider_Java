// Access modifier private

class Q1 {
    public static void main(String[] args) {
        MyClass myObject = new MyClass();
        //myObject.privateMethod();
       
    }
}

class MyClass {
    private void privateMethod() {
        System.out.println("This is a private method.");
    }
}
