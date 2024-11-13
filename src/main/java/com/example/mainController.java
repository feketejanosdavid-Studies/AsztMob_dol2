package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class mainController {

    @FXML
    private TextField ASideTF;

    @FXML
    private TextField BSideTF;

    @FXML
    private TextField CSideTF;

    @FXML
    private TextField DSideTF;

    @FXML
    private TextField ResultTF;

    @FXML
    void CaclButton(ActionEvent event) {
        StartCalc();
    }

    public void StartCalc() {
        double a = Double.parseDouble(ASideTF.getText());
        double b = Double.parseDouble(BSideTF.getText());
        double c = Double.parseDouble(CSideTF.getText());
        double d = Double.parseDouble(DSideTF.getText());

        double result = ((a + c) / (4 * (a - c))) * 
        Math.sqrt(((a + b - c + d) * (a - b - c + d) * (a + b - c - d) * (-a + b + c + d)));

        ResultTF.setText(String.valueOf(result));
    }

    

}
