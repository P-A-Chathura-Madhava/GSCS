package controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class PaymentsListFormController {
    public AnchorPane paymentsIndividualsFormContext;
    public TextField txtSearch;
    public TableView tblPaymentsList;
    public JFXButton btnBack;

    public void back(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage)paymentsIndividualsFormContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/PaymentsDashBoardForm.fxml"))));
    }
}
