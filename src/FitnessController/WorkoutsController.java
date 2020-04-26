package FitnessController;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;


import javafx.scene.input.MouseEvent;


import java.net.URL;
import java.util.ResourceBundle;

public class WorkoutsController extends AnchorPane implements Initializable {

    Main application;
    @FXML Label recentLabel;
    @FXML Label currentLabel;
    @FXML Label futureLabel;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    public void goToMostRecent() {
        application.goToRecent();
    }

    public void goToCurrent(){
        application.goToCurrent();
    }

    public void goToFuture(){
        application.goToFuture();
    }
    //do these all really need to be methods of Main? Could just be part of workouts...

    public void setHandlers() {
        recentLabel.setOnMouseClicked(e -> {
            goToMostRecent();
        });
        currentLabel.setOnMouseClicked(e ->{
            goToCurrent();
        });
        futureLabel.setOnMouseClicked(e -> {
            goToFuture();
        });

    }//setting handlers to register clicks on the labels


    public void setApp(Main main) {
        application = main;
    }
}
