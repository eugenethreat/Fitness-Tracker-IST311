package FitnessController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class HomepageController extends AnchorPane implements Initializable {

    private Main app;

    @FXML
    Hyperlink linkToSurvey;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    public HomepageController(){

    }//no-arg constructor

    public void goToSurvey(ActionEvent event){
        app.gotoSurvey();
    }


    public void setApp(FitnessController.Main main) {
        this.app = main;
    }

}
