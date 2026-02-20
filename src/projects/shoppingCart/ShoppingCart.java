package projects.shoppingCart;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Objects;

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
        Product[] cart = {
                new Product("Apple", BigDecimal.valueOf(2.30), 3),
                new Product("Orange", BigDecimal.valueOf(1.80), 2),
                new Product("Lemon", BigDecimal.valueOf(1.99), 4),
                new Product("Ginger", BigDecimal.valueOf(3.27), 1),
                new Product("Chocolate", BigDecimal.valueOf(2.89), 10)
        };

        BigDecimal total = calculateCartTotal(cart);

        System.out.printf("%12s%12s%12s%n", "Item", "Price", "Qty");

        for(Product p : cart) {
            System.out.println(p);
        }

        System.out.printf("%24s%8.2f%6s", "Total", total, "Euro");

    }

    public static BigDecimal calculateCartTotal(Product[] cart) {
        BigDecimal total = BigDecimal.ZERO;
        for (Product p : cart) {
            total = total.add(p.calculateTotal());
        }
        return total;
    }
}

