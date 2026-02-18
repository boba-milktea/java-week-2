package projects;

/**
 * 8. 🛒 Shopping Cart (Array of Objects)
 * Concepts used: Classes, objects, arrays, methods.
 *
 * Create a Product class with fields: name, price, quantity.
 * Store 5 products in an array.
 * Write a method calculateTotal() that returns the total price of all products in the cart.
 * Print the bill with product details and the total.
 */

public class ShoppingCart {

    public static void main(String[] args) {
        Product[] products = {
                new Product ("Apple", 1.30, 5),
                new Product ( "Ginger", 2.20, 3),
                new Product ("Bag of chicken", 5.80, 2),
                new Product ("potato", 0.99, 10),
                new Product ("tomato", 1, 3)
        };
        double totalPrice = 0;

        for (Product p : products) {
            totalPrice += p.calculateTotal(p.price, p.quantity);

        }
        System.out.println("The total price of your cart is: " + totalPrice + " EUR");
    }

}

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
