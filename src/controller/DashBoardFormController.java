package controller;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DashBoardFormController implements Initializable {
    public AnchorPane dashBoardContext;
    public AnchorPane slider;
    public Label Menu;
    public Label MenuClose;

    public void openInquiryDashBoardForm(ActionEvent actionEvent) throws IOException {
        openUI("InquiryDashBoardForm");
    }

    public void OpenRegistrationForm(ActionEvent actionEvent) throws IOException {
        openUI("RegistrationForm");
    }

    public void openPaymentForm(ActionEvent actionEvent) throws IOException {
        openUI("PaymentsDashBoardForm");
    }

    public void openAssignmentsForm(ActionEvent actionEvent) throws IOException {
        openUI("OrderDetailsForm");
    }

    void openUI(String fileName) throws IOException {
        Stage stage = (Stage)dashBoardContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+fileName+".fxml"))));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        slider.setTranslateX(-188);
        Menu.setOnMouseClicked(event -> {
            TranslateTransition slide = new TranslateTransition();
            slide.setDuration(Duration.seconds(0.4));
            slide.setNode(slider);

            slide.setToX(0);
            slide.play();

            slider.setTranslateX(-188);

            slide.setOnFinished((ActionEvent e)-> {
                Menu.setVisible(false);
                MenuClose.setVisible(true);
            });
        });

        MenuClose.setOnMouseClicked(event -> {
            TranslateTransition slide = new TranslateTransition();
            slide.setDuration(Duration.seconds(0.4));
            slide.setNode(slider);

            slide.setToX(-188);
            slide.play();

            slider.setTranslateX(0);

            slide.setOnFinished((ActionEvent e)-> {
                Menu.setVisible(true);
                MenuClose.setVisible(false);
            });
        });
    }
}
