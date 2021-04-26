package com.company;

public class Main {

    public static void main(String[] args) {
        Product product = new Product();
        product.setId(1);
        product.name="Laptop";
        product.description="Asus Laptop";
        product.price=6000;
        product.stockAmount=3;
        product.renk="mavi";

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        productManager.Add2(1,"","",2,200);
    }
}
