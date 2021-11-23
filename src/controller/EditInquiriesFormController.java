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

public class EditInquiriesFormController {

    public TextField txtSearch;
    public TableView tblInquiriesList;
    public JFXButton btnBack;
    public AnchorPane allInquiriesFormContext;

    public void back(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage)allInquiriesFormContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/InquiryDashBoardForm.fxml"))));
    }
}
