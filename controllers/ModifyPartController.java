/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import model.Inventory;
import model.Part;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author IanIk
 */
public class ModifyPartController implements Initializable {
    
    Stage stage;
    Parent scene;
    Inventory inv;
    Part part;

    @FXML
    private AnchorPane modifyPart;
    @FXML
    private RadioButton modifyPartInHouseRB;
    @FXML
    private ToggleGroup modifyPartTG;
    @FXML
    private RadioButton modifyPartOutsourcedRB;
    @FXML
    private TextField modifyPartIdTxt;
    @FXML
    private TextField modifyPartNameTxt;
    @FXML
    private TextField modifyPartInvTxt;
    @FXML
    private TextField modifyPartPriceCostTxt;
    @FXML
    private TextField modifyPartMaxTxt;
    @FXML
    private TextField modifyPartMachineIdTxt;
    @FXML
    private TextField modifyPartMinTxt;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onActionSaveModifyPart(MouseEvent event) {
    }

    @FXML
    private void onActionCancelModifyPart(MouseEvent event) throws IOException {
        stage = (Stage)((Button)event.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/view/mainScreen.fxml"));
        stage.setScene(new Scene(scene));
        stage.show();  
    }
    
}
