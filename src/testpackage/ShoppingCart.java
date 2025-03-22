package testpackage;

import java.util.ArrayList;

/*
* **Problem:**

Create a class `Product` with attributes:

- Product Name
- Price
- Quantity

Design a class `ShoppingCart` to:

1. Add products to the cart.
2. Remove products from the cart.
3. Display total cost.

**Hint:** Use `ArrayList` to store products.
*
* */
//
class MrpNotValid extends Exception {
    MrpNotValid(String message) {
        super(message);

    }


}

class Product_name_not_valid extends Exception {
    Product_name_not_valid(String message) {
        super(message);
    }
}

public class ShoppingCart {
    //    we will use Arraylist to add multiple products in the cart
    ArrayList<Product> cartList = new ArrayList<Product>();

    //    int ages[5] = { 22,34,21,34,55}
    void add_to_cart(Product product) {
        cartList.add(product);
        System.out.println(product.Product_name + " has been added");
    }

    void remove_product(Product product) {
        cartList.remove(product);
        System.out.println(product.Product_name + " has been removed");
    }

    void displayAllProduct() {
//     int[] arr = {1,23,45,67};
        for (Product x : cartList) {
            System.out.println("------");
            System.out.println(x.Product_name);
            System.out.println(x.price);
            System.out.println(x.quantity);
            System.out.println("------");
        }
    }

    void display_total_cost() {
//    prod1.price +prod2.price + prod3.price
        int totalPrice = 0;
        for (Product x : cartList) {
            totalPrice = totalPrice + x.price;
        }
        displayAllProduct();
        System.out.println("total bill amount: " + totalPrice);

//     int sum = 0;
//     for(int i =0 ;i<=20;i++){
//         sum = sum + i;
//     }

    }

    public static void main(String[] args) {
        try{
            Product smartwatch = new Product("Apple watch 3", 36000, 1);
            Product instax_camera = new Product("fuji film", 6999, 1);
            Product drone = new Product("Ziria", -3999, 1);
            Product toothpaste = new Product("", 100, 1);
            ShoppingCart obj2 = new ShoppingCart();
            obj2.add_to_cart(smartwatch);
            obj2.add_to_cart(instax_camera);
            obj2.add_to_cart(drone);
            obj2.add_to_cart(toothpaste);
            obj2.displayAllProduct();
            obj2.display_total_cost();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }




    }

}

class Product {
    String Product_name;
    int price;
    int quantity;

//    constructor, method/function name lk sath me throws use karte hain

    Product(String pn, int mrp, int quant) throws MrpNotValid,Product_name_not_valid  {
//   int[] arr = {1,2,3,4,5}

            if (pn.isEmpty()) {
                throw new Product_name_not_valid("pn cant be empty");
            }
            this.Product_name = pn;
            if (mrp < 0) {
                throw new MrpNotValid("mrp cannot be negative");
            }
            this.price = mrp;


        this.quantity = quant;


    }

}
