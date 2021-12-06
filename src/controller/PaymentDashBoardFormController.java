package controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class PaymentDashBoardFormController {
    public AnchorPane paymentsContext;
    public Button btnList;
    public JFXButton btnBack;
    public Button btnIndividuals;

    public void back(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage)paymentsContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/DashBoardForm.fxml"))));
    }

    void openUI(String fileName) throws IOException {
        Stage stage = (Stage)paymentsContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+fileName+".fxml"))));
    }

    public void openIndividualsForm(ActionEvent actionEvent) throws IOException {
        openUI("PaymentIndividualDashBoardForm");
    }

    public void openPaymentsListForm(ActionEvent actionEvent) throws IOException {
        openUI("PaymentsListForm");
    }
}
