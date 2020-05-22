/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Inventory;
import model.Part;
import model.Product;
import java.io.IOException;

/**
 * FXML Controller class
 *
 * @author IanIk
 */
public class MainScreenController implements Initializable {
    
    Stage stage;
    Parent scene;
    Inventory inv;

    @FXML
    private AnchorPane mainPartsTable;
    @FXML
    private TextField mainPartsTableSearchTxt;
    @FXML
    private TableColumn<Part, Integer> mainPartsTablePartIdCol;
    @FXML
    private TableColumn<Part, String> mainPartsTablePartNameCol;
    @FXML
    private TableColumn<Part, Integer> mainPartsTablePartInvLvlCol;
    @FXML
    private TableColumn<Part, Double> mainPartsTablePartPriceCostCol;
    @FXML
    private Button mainPartsTablePartModifybtn;
    @FXML
    private AnchorPane mainProductsTable;
    @FXML
    private TextField mainProductsTableSearchTxt;
    @FXML
    private TableColumn<Product, Integer> mainProductsTableProductIdCol;
    @FXML
    private TableColumn<Product, String> mainProductsTableProductNameCol;
    @FXML
    private TableColumn<Product, Integer> mainProductsTableInvLvlCol;
    @FXML
    private TableColumn<Product, Double> mainProductsTablePriceCostCol;
    
    public MainScreenController(Inventory inv) {
        this.inv = inv;
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onActionSearchPartMainTable(MouseEvent event) {
    }

    @FXML
    private void onActionDeletePartMainTable(MouseEvent event) throws IOException {
        stage = (Stage)((Button)event.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/view/modifyPart.fxml"));
        stage.setScene(new Scene(scene));
        stage.show();        
    }

    @FXML
    private void onActionModifyPartMainTable(MouseEvent event) throws IOException {
        stage = (Stage)((Button)event.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/view/modifyPart.fxml"));
        stage.setScene(new Scene(scene));
        stage.show();
    }

    @FXML
    private void onActionAddPartMainTable(MouseEvent event) throws IOException {
        stage = (Stage)((Button)event.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/view/addPart.fxml"));
        stage.setScene(new Scene(scene));
        stage.show();
    }

    @FXML
    private void onActionSearchProductMainTable(MouseEvent event) {
    }

    @FXML
    private void onActionDeleteProductMainTable(MouseEvent event) throws IOException {
        stage = (Stage)((Button)event.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/view/modifyProduct.fxml"));
        stage.setScene(new Scene(scene));
        stage.show();
    }

    @FXML
    private void onActionModifyProductMainTable(MouseEvent event) throws IOException {
        stage = (Stage)((Button)event.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/view/modifyProduct.fxml"));
        stage.setScene(new Scene(scene));
        stage.show();
    }

    @FXML
    private void onActionAddProductMainTable(MouseEvent event) throws IOException {
        stage = (Stage)((Button)event.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/view/addProduct.fxml"));
        stage.setScene(new Scene(scene));
        stage.show();
    }

    @FXML
    private void onActionExitMainTable(MouseEvent event) {
        Platform.exit();
    }
    
}
