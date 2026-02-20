package projects.shoppingCart;

import java.math.BigDecimal;

class Product {
   String name;
   BigDecimal price;
   Integer quantity;

   public Product() {
       this.name= "";
       this.price= BigDecimal.ZERO;
       this.quantity=0;
   }

   public Product(String name, BigDecimal price, Integer quantity) {
       this.name = name;
       this.price = price;
       this.quantity = quantity;
   }

   public BigDecimal calculateTotal () {
       return price.multiply(BigDecimal.valueOf(quantity));
   }


   public void displayCart() {
        System.out.printf("%12s%12.2f%12d%n", name, price, quantity);
    }

    public String toString() {
       return String.format("%12s%12.2f%12d", name, price, quantity);
    }
}



