package dto;

public class Product {
    private int id;
    private String name;
    private String description;
    private double price;

    /**
     * Constyructor del Objeto Producto.
     * @param id
     * @param name
     * @param description
     * @param price
     */
    public Product(int id, String name, String description, double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }
    // Getters

    /**
     * Obtener atributo id.
     * @return int
     */
    public int getId() {
        return id;
    }

    /**
     * Obtener atributo price.
     * @return double
     */
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return
                "ID: " + id + " " +
                "Nombre: " + name + " " +
                "Descripcion: " + description + " " +
                "Precio: " + price + "\n";
    }
}
