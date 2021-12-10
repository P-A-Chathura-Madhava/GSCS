package controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class EditInquiriesFormController {

    public TextField txtSearch;
    public TableView tblInquiriesList;
    public JFXButton btnBack;
    public AnchorPane allInquiriesFormContext;
    public JFXButton btnNewInquiry;

    public void openNewInquiryForm(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/NewInquiryForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage primaryStage =  new Stage();
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
