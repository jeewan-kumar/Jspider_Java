class A {
    public void main(String[] args) {
        System.out.println("Valid");
    }
}

/*
 * Output -
 * Error: Could not find or load main class a
*  Caused by: java.lang.NoClassDefFoundError: A (wrong name: a)
 */