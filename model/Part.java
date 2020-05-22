package model;

public abstract class Part {

    private int partId, stock, min, max;
    private String name;
    private double price = 0.0;

    public Part(int partId, String name, double price, int stock, int min, int max) {
        this.partId = partId;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.min = min;
        this.max = max;
    }

    public void setId(int id) { this.partId = id; }

    public int getId() { return this.partId; }

    public void setName(String name) { this.name = name; }

    public String getName() { return this.name; }

    public void setPrice(double price) { this.price = price; }

    public double getPrice() { return this.price; }

    public void setStock(int stock) { this.stock = stock; }

    public int getStock() { return this.stock; }

    public void setMin(int min) { this.min = min; }

    public int getMin() { return this.min; }

    public void setMax(int max) { this.max = max; }

    public int getMax() { return this.max; }

    boolean getPartId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

