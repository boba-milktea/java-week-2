package projects.shoppingCart;

class Product {
    String name;
    double price;
    int quantity;

    Product(String n, double p, int q)  {
        this.name = n;
        this.price = p;
        this.quantity = q;
    }

    static double calculateTotal (double p, int q) {
        return p * q;
    }
}

