package org.example.model;

public class Store {
    public static void main(String[] args) {

        ProductForSale[] products = new ProductForSale[5];
        products[0] = new Chocolate("sweet", 15, "chck desc");
        products[1] = new Bread("Bakery", 5, "br desc", "einkorn", "brown");
        products[2] = new Coke("Drinks", 15, "dr desc", true, 2.5);

        listProduct(products);
    }

    public static void listProduct(ProductForSale[] products){
        for (ProductForSale product : products){
            if(product != null){
                product.showDetails();
            }
        }
    }


}