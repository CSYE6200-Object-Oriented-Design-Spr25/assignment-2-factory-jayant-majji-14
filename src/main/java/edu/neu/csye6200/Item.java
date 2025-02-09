package edu.neu.csye6200;

public abstract class Item {
    protected int id;
    protected String name;
    protected double price;

    public Item(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    
    @Override
    public abstract String toString();
    
}
