package utils;

import dto.Product;

import java.util.Scanner;
public class Utils {
    private Scanner sc = new Scanner(System.in);
    private Validator validator = new Validator();

    /**
     * Utilidad menu para aádir Producto, sirve para dejar mas limpio el main.
     * @author Rafael Dijkstra
     * @return Product
     */
    public Product addProductMenu(){
        System.out.println("Inserte id del producto:");
        int id = validator.integerValidatorScanner(sc);
        sc.skip("\n"); // Para evitar salto de linea del Scanner.s

        System.out.println("Inserte nombre del producto:");
        String name = sc.nextLine();

        System.out.println("Inserte descripción del producto:");
        String description = sc.nextLine();

        System.out.println("Inserte precio del producto:");
        double price = validator.doubleValidatorScanner(sc);

        return new Product(id,name,description,price);
    }
}
