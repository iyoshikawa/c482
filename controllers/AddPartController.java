/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import model.Inventory;
import model.InHouse;
import model.Outsourced;
import model.Part;
import model.Product;
import java.io.IOException;
import java.net.URL;
import java.util.Random;
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
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author IanIk
 */
public class AddPartController implements Initializable {
    
    Stage stage;
    Parent scene;
    Inventory Inv;

    @FXML
    private AnchorPane addPart;
    @FXML
    private GridPane addPartInformation;
    @FXML
    private TextField addPartIdTxt;
    @FXML
    private TextField addPartNameTxt;
    @FXML
    private TextField addPartInvTxt;
    @FXML
    private TextField addPartPriceCostTxt;
    @FXML
    private TextField addPartMinTxt;
    @FXML
    private TextField addPartMaxTxt;
    @FXML
    private TextField addPartCompanyNameTxt;
    @FXML
    private RadioButton addPartInHouse;
    @FXML
    private ToggleGroup addPartTG;
    @FXML
    private RadioButton addPartOutsourced;
    private final Inventory inv;
    
    public AddPartController(Inventory inv) {
        this.inv = inv;
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        generatePartId();
        resetFields();
    }

    private void resetFields() {
        addPartNameTxt.setText("Part Name");
        addPartInvTxt.setText("Inv Count");
        addPartPriceCostTxt.setText("Part Price");
        addPartMinTxt.setText("Min");
        addPartMaxTxt.setText("Max");
        addPartIdTxt.setText("Machine ID");
        addPartCompanyNameTxt.setText("Machine ID");
        addPartInHouse.setSelected(true);
    }

    private void generatePartId() {
        boolean match;
        Random randomNum = new Random();
        Integer num = randomNum.nextInt(1000);

        if (inv.partListSize() == 0) {
            addPartIdTxt.setText(num.toString());

        }
        if (inv.partListSize() == 1000) {
            AlertMessage.errorPart(3, null);
        } else {
            match = verifyIfTaken(num);

            if (match == false) {
                addPartIdTxt.setText(num.toString());
            } else {
                generatePartId();
            }
        }
    }

    @FXML
    private void onActionSavePart(MouseEvent event) {
        resetFieldsStyle();
        boolean end = false;
        TextField[] fieldCount = {addPartInvTxt, addPartPriceCostTxt, addPartMinTxt, addPartMaxTxt};
        if (addPartInHouse.isSelected() || addPartOutsourced.isSelected()) {
            for (TextField fieldCount1 : fieldCount) {
                boolean valueError = checkValue(fieldCount1);
                if (valueError) {
                    end = true;
                    break;
                }
                boolean typeError = checkType(fieldCount1);
                if (typeError) {
                    end = true;
                    break;
                }
            }
            if (addPartNameTxt.getText().trim().isEmpty() || addPartNameTxt.getText().trim().toLowerCase().equals("part name")) {
                AlertMessage.errorPart(4, addPartNameTxt);
                return;
            }
            if (Integer.parseInt(addPartMinTxt.getText().trim()) > Integer.parseInt(addPartMaxTxt.getText().trim())) {
                AlertMessage.errorPart(8, addPartMinTxt);
                return;
            }
            if (Integer.parseInt(addPartInvTxt.getText().trim()) < Integer.parseInt(addPartMinTxt.getText().trim())) {
                AlertMessage.errorPart(6, addPartInvTxt);
                return;
            }
            if (Integer.parseInt(addPartInvTxt.getText().trim()) > Integer.parseInt(addPartMaxTxt.getText().trim())) {
                AlertMessage.errorPart(7, addPartInvTxt);
                return;
            }
            if (end) {
                return;
            } else if (company.getText().trim().isEmpty() || company.getText().trim().toLowerCase().equals("company name")) {
                AlertMessage.errorPart(3, company);
                return;

            } else if (inHouseRadio.isSelected() && !company.getText().trim().matches("[0-9]*")) {
                AlertMessage.errorPart(9, company);
                return;
            } else if (addPartInHouse.isSelected()) {
                addInHouse();

            } else if (addPartOutsourced.isSelected()) {
                addOutSourced();

            }

        } else {
            AlertMessage.errorPart(2, null);
            return;

        }
        mainScreen(event);
    }

    private void addInHouse() {
        inv.addPart(new InHouse(Integer.parseInt(id.getText().trim()), name.getText().trim(),
                Double.parseDouble(price.getText().trim()), Integer.parseInt(count.getText().trim()),
                Integer.parseInt(min.getText().trim()), Integer.parseInt(max.getText().trim()), (Integer.parseInt(addPartCompanyNameTxt.getText().trim()))));

    }

    private void addOutSourced() {
        inv.addPart(new addPartOutsourced(Integer.parseInt(addPartIdTxt.getText().trim()), addPartNameTxt.getText().trim(),
                Double.parseDouble(addPartPriceCostTxt.getText().trim()), Integer.parseInt(addPartInvTxt.getText().trim()),
                Integer.parseInt(addPartMinTxt.getText().trim()), Integer.parseInt(addPartMaxTxt.getText().trim()), addPartCompanyNameTxt.getText().trim()));

    }
    
    @FXML
    private void onActionCancelPart(MouseEvent event) throws IOException {
        
        stage = (Stage)((Button)event.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/view/mainScreen.fxml"));
        stage.setScene(new Scene(scene));
        stage.show();
    }
    
    @FXML
    private void selectOutSourced(MouseEvent event) {
        addPartCompanyNameTxt.setText("Company Name");
        addPartCompanyNameTxt.setText("Company Name");
    }


}


