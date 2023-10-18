import dto.ShoppingCart;
import utils.Utils;
import utils.Validator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int opcion = -1;

        Scanner sc = new Scanner(System.in);
        ShoppingCart shoppingCart = new ShoppingCart();
        Utils utils = new Utils();
        Validator validator = new Validator();

        while(opcion != 0) {
            System.out.println("Elige una de las opciones:");
            System.out.println("1- Añadir producto al carrito.");
            System.out.println("2- Eliminar producto del carrito.");
            System.out.println("3- Ver carrito.");
            System.out.println("4- Ver precio total del carrito.");
            System.out.println("0- Salir.");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> shoppingCart.addProduct(utils.addProductMenu());
                case 2 -> {
                    System.out.println("Elimina uno de los productos por id:");
                    System.out.println(shoppingCart.getShoppingCart().toString());
                    int id = validator.integerValidatorScanner(sc);
                    shoppingCart.removeProduct(id);
                }
                case 3 -> System.out.println(shoppingCart.getShoppingCart().toString());
                case 4 -> System.out.println("Precio total del carrito: " + shoppingCart.calculateAllThePrices());
            }
        }
    }
}