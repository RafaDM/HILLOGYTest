package utils;

import java.util.Scanner;

public class Validator {
    /**
     * Validar tipo de dato int introducidos desde un Scanner.
     * @author Rafael Dijkstra
     * @param sc Scanner Object
     * @return int
     */
    public int integerValidatorScanner(Scanner sc){
        int number;
        do {
            while(!sc.hasNextInt()){
                System.out.println("Introduce un numero.");
                sc.next();
            }
            number = sc.nextInt();
        } while (number <= 0);
        return number;
    }
    /**
     * Validar tipo de dato double introducidos desde un Scanner.
     * @author Rafael Dijkstra
     * @param sc Scanner Object
     * @return double
     */
    public double doubleValidatorScanner(Scanner sc){
        double number;
        do {
            while(!sc.hasNextDouble()){
                System.out.println("Introduce un numero.");
                sc.next();
            }
            number = sc.nextDouble();
        } while (number <= 0);
        return number;
    }

}
