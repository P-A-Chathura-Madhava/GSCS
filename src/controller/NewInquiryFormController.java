package controller;

import com.jfoenix.controls.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class NewInquiryFormController {
    public AnchorPane newInquiryContext;
    public JFXTextField txtName;
    public JFXTextField txtMobile;
    public JFXComboBox cmbDegree;
    public JFXRadioButton rBtnMale;
    public JFXRadioButton rBtnFemale;
    public JFXTextField txtDistrict;
    public JFXTextArea txtComments;
    public JFXTextArea txtStatus;
    public JFXButton btnOk;
    public JFXButton btnBack;

    public void back(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage)newInquiryContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/InquiryDashBoardForm.fxml"))));
    }
}
