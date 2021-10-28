package com.example.latintoarabicnumeration;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private Button buttonC;

    @FXML
    private Button buttonD;

    @FXML
    private Button buttonDel;

    @FXML
    private Button buttonEqual;

    @FXML
    private Button buttonI;

    @FXML
    private Button buttonL;

    @FXML
    private Button buttonM;

    @FXML
    private Button buttonPlus;

    @FXML
    private Button buttonSubtraction;

    @FXML
    private Button buttonV;

    @FXML
    private Button buttonX;

    @FXML
    private TextField textField;

    @FXML
    void COnAction(ActionEvent event) {

    }

    @FXML
    void DOnAction(ActionEvent event) {

    }

    @FXML
    void EqualOnAction(ActionEvent event) {

    }

    @FXML
    void IOnAction(ActionEvent event) {

    }

    @FXML
    void LOnAction(ActionEvent event) {

    }

    @FXML
    void MOnAction(ActionEvent event) {

    }

    @FXML
    void PlusOnAction(ActionEvent event) {

    }

    @FXML
    void VOnAction(ActionEvent event) {

    }

    @FXML
    void XOnAction(ActionEvent event) {

    }

    @FXML
    void deleteOnAction(ActionEvent event) {
        String Enternumber = textField.getText() + buttonDel.getText();
        textField.setText(Enternumber);
    }

    @FXML
    void subtractionOnAction(ActionEvent event) {

    }

}
