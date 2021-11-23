package controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class InquiryDashBoardFormController {
    public Button btnNewInquiry;
    public Button btnList;
    public AnchorPane inquiriesContext;
    public JFXButton btnBack;

    public void openNewInquiryForm(ActionEvent actionEvent) throws IOException {
        openUI("NewInquiryForm");
    }

    public void openEditInquiriesForm(ActionEvent actionEvent) throws IOException {
        openUI("EditInquiriesForm");
    }

    void openUI(String fileName) throws IOException {
        Stage stage = (Stage)inquiriesContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+fileName+".fxml"))));
    }

    public void back(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage)inquiriesContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/DashBoardForm.fxml"))));
    }
}
