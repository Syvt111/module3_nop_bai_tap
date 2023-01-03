package model;

public class Product {
    private int id ;
    private String name ;
    private double price ;
    private String description  ;
    private String maker ;

    public Product() {

    }

    public Product(int id, String name, double price, String description, String maker) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.maker = maker;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getMaker() {
        return maker;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }
}
