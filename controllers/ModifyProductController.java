/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import model.Product;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
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
public class ModifyProductController implements Initializable {

    Stage stage;
    Parent scene;
    
    @FXML
    private AnchorPane modifyPartMulti;
    @FXML
    private TableView<Product> modifyProductAddTable;
    @FXML
    private TableColumn<Product, Integer> modifyProdMultiPartAddColID;
    @FXML
    private TableColumn<Product, String> modifyProdMultiPartAddColName;
    @FXML
    private TableColumn<Product, Integer> modifyProdMultiPartAddColInvLvl;
    @FXML
    private TableColumn<Product, Double> modifyProdMultiPartAddColPriceCost;
    @FXML
    private TableView<Product> modifyProductDeleteTable;
    @FXML
    private TableColumn<Product, Integer> modifyProdMultiPartDeleteColID;
    @FXML
    private TableColumn<Product, String> modifyProdMultiPartDeleteColName;
    @FXML
    private TableColumn<Product, Integer> modifyProdMultiPartDeleteColInvLvl;
    @FXML
    private TableColumn<Product, Double> modifyProdMultiPartDeleteColPrice;
    @FXML
    private TextField modifyProdMultiTxtSearch;
    @FXML
    private AnchorPane modifyPartMultiTxt;
    @FXML
    private TextField modifyProdMultiTxtId;
    @FXML
    private TextField modifyProdMultiTxtName;
    @FXML
    private TextField modifyProdMultiTxtInv;
    @FXML
    private TextField modifyProdMultiTxtPrice;
    @FXML
    private TextField modifyProdMultiTxtMax;
    @FXML
    private TextField modifyProdMultiTxtMin;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onActionSearchModifyProdutMulti(MouseEvent event) {
    }

    @FXML
    private void onActionAddModifyProdMulti(MouseEvent event) {
    }

    @FXML
    private void onActionDeletemodifyProdMulti(MouseEvent event) {
    }

    @FXML
    private void onActionCancelModifyProdMulti(MouseEvent event) {
    }

    @FXML
    private void onActionSavemodifyProdMulti(MouseEvent event) {
    }
    
}
