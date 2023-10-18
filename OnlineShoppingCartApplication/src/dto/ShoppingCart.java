package dto;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    public static final List<Product> listProduct = new ArrayList<>();
    private double totalPrice;

    /**
     *  Method to add product in the shopping cart.
     *  Validate if the id is already in the shopping cart.
     * @param product Product Object.
     */
    public void addProduct(Product product){
        for (Product productFromList : listProduct) {
            if (product.getId() == productFromList.getId()) {
                System.err.println("Id ya introducido anteriormente.");
                return;
            }
        }
        listProduct.add(product);
    }

    /**
     * Method to remove product from the shopping cart.
     * @param id A id int param.
     */
    public void removeProduct(int id){

        for (Product product : listProduct) {
            if (id == product.getId()) {
                listProduct.remove(product);
                break;
            }
        }
    }

    /**
     * Method to get the shopping cart
     * @return List<Product>
     */
    public List<Product> getShoppingCart(){
        return listProduct;
    }

    /**
     * Method to calculate the total price of the shoppingcart.
     * @return double
     */
    public double calculateAllThePrices(){
        totalPrice = 0;
        for (Product product : listProduct) {
           totalPrice += product.getPrice();
        }

        return totalPrice;
    }
}
