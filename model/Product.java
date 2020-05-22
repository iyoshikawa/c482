package model;

import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Product {
    
    private ArrayList<Part> associatedParts = new ArrayList<Part>();
//    private ArrayList<Part> allAssociatedParts = new ArrayList<Part>();
    private int productId;
    private String name;
    private double productPrice = 0.0;
    private int productStock = 0;
    private int min;
    private int max;
    
    public Product(int productId, String name, double productPrice, int productStock, int min, int max) {
        setProductId(productId);
        setName(name);
        setProductPrice(productPrice);
        setProductStock(productStock);
        setMin(min);
        setMax(max);
    }

    
    public void addAssociatedParts(Part partToAdd) { associatedParts.add(partToAdd); }
    
    public boolean deleteAssociatedPart(int selectedAssociatedPart){
        int i;
        for (i = 0; i < associatedParts.size(); i++) {
            if (associatedParts.get(i).getId() == selectedAssociatedPart) {
                associatedParts.remove(i);
                return true;
            }
        }
        return false;
    }
    
//    public Part SearchAssociatedPart(int partToSearch) {
//        for (int i = 0; i < associatedParts.size(); i++) {
//            if (associatedParts.get(i).getPartID() == partToSearch) {
//                return associatedParts.get(i);
//            }
//        }
//        return null;
//    }
    
    // setters and getters outside of observable list
    
    public ArrayList<Part> getAllAssociatedParts() {
        return associatedParts;
    }
    
    public void setProductId(int id) { this.productId = productId; }

    public int getProductId() { return this.productId; }

    public void setName(String name) { this.name = name; }

    public String getName() { return this.name; }

    public void setProductPrice(double price) { this.productPrice = productPrice; }

    public double getProductPrice() { return this.productPrice; }

    public void setProductStock(int stock) { this.productStock = productStock; }

    public int getProductStock() { return this.productStock; }

    public void setMin(int min) { this.min = min; }

    public int getMin() { return this.min; }

    public void setMax(int max) { this.max = max; }

    public int getMax() { return this.max; }
 
}