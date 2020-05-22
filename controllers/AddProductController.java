/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import model.Product;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author IanIk
 */
public class AddProductController implements Initializable {

    Stage stage;
    Parent scene;
    
    @FXML
    private AnchorPane addProductMulti;
    @FXML
    private TableView<Product> addProductAddTable;
    @FXML
    private TableColumn<Product, Integer> addProductMultiPartAddIDCol;
    @FXML
    private TableColumn<Product, String> addProductMultiPartAddNameCol;
    @FXML
    private TableColumn<Product, Integer> addProductMultiPartAddInvLvlCol;
    @FXML
    private TableColumn<Product, Double> addProductMultiPartAddPriceCol;
    @FXML
    private TableView<Product> addProductDeleteTable;
    @FXML
    private TableColumn<Product, Integer> addProductMultiPartDeleteIDCol;
    @FXML
    private TableColumn<Product, String> addProductMultiPartDeleteNameCol;
    @FXML
    private TableColumn<Product, Integer> addProductMultiPartDeleteInvCol;
    @FXML
    private TableColumn<Product, Double> addProductMultiPartDeletePriceCol;
    @FXML
    private TextField addProductMultiSearchTxt;
    @FXML
    private TextField addProductMultiInv;
    @FXML
    private TextField addProductMultiPrice;
    @FXML
    private TextField addProductMultiMax;
    @FXML
    private TextField addProductMultiMin;
    @FXML
    private TextField addProductMultiID;
    @FXML
    private TextField addProductMultiName;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onActionAddProductMulti(MouseEvent event) {
    }

    @FXML
    private void onActionDeleteProdMulti(MouseEvent event) {
    }

    @FXML
    private void onActionSaveProdMulti(MouseEvent event) {
    }

    @FXML
    private void onActionCancelProdMulti(MouseEvent event) throws IOException {
        stage = (Stage)((Button)event.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/view/mainScreen.fxml"));
        stage.setScene(new Scene(scene));
        stage.show();
    }

    @FXML
    private void onActionSearchAddProductMulti(MouseEvent event) {
    }
    
}
