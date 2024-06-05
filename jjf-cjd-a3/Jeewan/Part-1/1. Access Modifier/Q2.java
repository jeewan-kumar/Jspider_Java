// Access modifier default

class Q2 {
    public static void main(String[] args) {
       
        MyClass myObject = new MyClass();

        myObject.defaultMethod();
    }
}

class MyClass {
    
    void defaultMethod() {
        System.out.println("This is a default private method.");
    }
}
