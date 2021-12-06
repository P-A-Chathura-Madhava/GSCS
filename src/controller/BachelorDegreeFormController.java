package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class BachelorDegreeFormController {
    public AnchorPane bachelorDegreeFormContext;
    public JFXTextField txtName;
    public JFXTextField txtDegree;
    public JFXTextField txtContact;
    public JFXTextField txtRegistrationNumber;
    public JFXButton btnBack;
    public JFXTextField txtName1;
    public JFXTextField txtRegistrationNumber1;
    public JFXButton btnUpdate;

    public void cmbUniversity(ActionEvent actionEvent) {
    }

    public void back(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage)bachelorDegreeFormContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/PaymentIndividualDashBoardForm.fxml"))));
    }
}
