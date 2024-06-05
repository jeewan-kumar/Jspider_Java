class Q3 {
    String name;
    double price;
    int quantity;

    public static void main(String[] args) {
        Q3 product = new Q3();
        product.name = "Laptop";
        product.price = 799.99;
        product.quantity = 10;

        System.out.println("Product: " + product.name);
        System.out.println("Price: $" + product.price);
        System.out.println("Quantity: " + product.quantity);
    }
}

