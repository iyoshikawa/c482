package model;

import java.util.ArrayList;
import javafx.collections.*;



public class Inventory {

    //private ObservableList<Product> allProducts = FXCollections.observableArrayList();
    //private ObservableList<Part> allParts = FXCollections.observableArrayList();
    
    private ArrayList<Product> allProducts;
    private ArrayList<Part> allParts;
    
    
    public Inventory() {
        allProducts = new ArrayList<>();
        allParts = new ArrayList<>();
    }

    /////////
    // Parts
    /////////

    public void addPart(Part partToAdd) {
        if (partToAdd != null) {
            this.allParts.add(partToAdd);
        }
    }

    public void updatePart(Part selectedPart)  { 
        for (int i = 0; i < allParts.size(); i++) {
            if (allParts.get(i).getPartId() == selectedPart.getPartId()) {
                allParts.set(i, selectedPart);
                break;
            }
        }
        return;
    }
    
    public boolean deletePart(Part partDelete) {
        for(int i = 0; i < allParts.size(); i++){
            if(allParts.get(i).getPartId() == partDelete.getPartId()){
                allParts.remove(i);
                return true;
            }
        }
        return false;
    }

    public ObservableList<Part> lookupPart(String partNameLookup) {
        if(!allParts.isEmpty()){
            ObservableList searchedPartList = FXCollections.observableArrayList();
            for (Part p : getAllParts()) {
                if(p.getName().contains(partNameLookup)){
                    searchedPartList.add(p);
                }
            }
            return searchedPartList;
        }
       return null;
    }
  
    public Part lookupPart(int lookupPart) {
        if (!allParts.isEmpty()) {
            for (int i = 0; i < allParts.size(); i++) {
                if(allParts.get(i).getId() == lookupPart) {
                    return allParts.get(i);
                }
            }
        }
        return null;
    }

    public ArrayList<Part> getAllParts() { 
        return allParts; 
    }

    
    
    ////////////
    // Product
    ///////////
    
    
    public void addPoduct(Product productToAdd) { 
        if(productToAdd != null){
            this.allProducts.add(productToAdd);
        }
    }

    public void updateProduct(Product product)  { 
        for(int i = 0; i < allProducts.size(); i++) {
            if(allProducts.get(i).getProductId() == product.getProductId()){
                allProducts.set(i, product);
                break;
            }
        }
        return;
    }

    public boolean deleteProduct(Product selectedProduct) {
        for (int i = 0; i < allProducts.size(); i++){
            if(allProducts.get(i).getProductId() == selectedProduct.getProductId()) {
                allProducts.remove(i);
                return true;
            }
        }
        return false;
    }
    
//    public ArrayList<Product> lookupProduct(String productNameLookup){
//        if(!allProducts.isEmpty()) {
//             ObservableList searchedProductList = FXCollections.observableArrayList();
//            for (Product p : getAllProducts()) {
//                if(p.getName().contains(partNameLookup)){
//                    searchedPartList.add(p);
//                }
//            }
//            return searchedPartList;
//        }
//       return null;
//    }
    public ObservableList<Part> lookUpProduct(String productNameToLookUp) {
        return null;
    }

    public Product lookupProduct(int productIdLookup) {
        if(!allProducts.isEmpty()) {
            for(int i = 0; i < allProducts.size(); i++){
                if(allProducts.get(i).getProductId() == productIdLookup){
                    return allProducts.get(i);
                }
            }
        }
        return null;
    }

    public ArrayList<Product> getAllProducts() {
        return allProducts;
    }
    
    public int partListSize() {
        return allParts.size();
    }

    public int productListSize() {
        return allProducts.size();
    }

}
