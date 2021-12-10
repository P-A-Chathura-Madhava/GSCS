package controller;

import com.jfoenix.controls.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class RegistrationFormController {
    public JFXComboBox cmbYear;
    public JFXDatePicker datePicker;
    public JFXButton btnDocuments;
    public JFXButton btnFinish;
    public JFXTextField txtEmail;
    public JFXTextField txtOccupation;
    public JFXTextField txtOrganization;
    public JFXButton btnBack;
    public JFXTextField txtNationality;
    public JFXTextField txtBirthPlace;
    public JFXTextField txtNIC;
    public JFXTextField txtRegistrationNumber;
    public JFXTextField txtContact;
    public JFXTextField txtDegree;
    public JFXTextArea txtAddress;
    public JFXTextField txtName;
    public AnchorPane registrationContext;
    public JFXButton btnPayment;
    public JFXComboBox cmbDegreeCategory;

    public void initialize(){
        cmbDegreeCategory.getItems().addAll(
          "Bachelor Degree", "Masters Degree"
        );
    }

    public void cmbUniversity(ActionEvent actionEvent) {
    }

    public void back(ActionEvent actionEvent) throws IOException {
    }

    public void openPaymentForm(ActionEvent actionEvent) throws IOException {
        if((cmbDegreeCategory.getValue().toString()) == "Bachelor Degree"){
            Stage stage = (Stage)registrationContext.getScene().getWindow();
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/BachelorDegreeForm.fxml"))));
        }else {
            Stage stage = (Stage)registrationContext.getScene().getWindow();
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/MastersDegreeForm.fxml"))));
        }

    }


}
