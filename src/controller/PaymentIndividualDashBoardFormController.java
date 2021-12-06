package controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class PaymentIndividualDashBoardFormController {
    public AnchorPane individualPaymentContext;
    public Button btnBachelorDegree;
    public Button btnMastersDegree;
    public JFXButton btnBack;

    public void back(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage)individualPaymentContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/PaymentsDashBoardForm.fxml"))));
    }

    public void openMastersDegreeForm(ActionEvent actionEvent) throws IOException {
        openUI("MastersDegreeForm");
    }

    public void openBachelorDegreeForm(ActionEvent actionEvent) throws IOException {
        openUI("BachelorDegreeForm");
    }

    void openUI(String fileName) throws IOException {
        Stage stage = (Stage)individualPaymentContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+fileName+".fxml"))));
    }
}
