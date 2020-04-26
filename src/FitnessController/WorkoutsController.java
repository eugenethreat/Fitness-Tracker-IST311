package FitnessController;

import FitnessModel.Exercise;
import FitnessModel.User;
import FitnessModel.Workout;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;


import javafx.scene.input.MouseEvent;


import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class WorkoutsController extends AnchorPane implements Initializable {

    Main application;
    @FXML
    Label recentLabel;
    @FXML
    Label currentLabel;
    @FXML
    Label futureLabel;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    public void goToMostRecent() {
        application.goToRecent();
    }

    public void goToCurrent() {
        application.goToCurrent();
    }

    public void goToFuture() {
        application.goToFuture();
    }
    //do these all really need to be methods of Main? Could just be part of workouts...

    public void setWorkoutFields() {
        User user = application.getLoggedUser();

        ArrayList<Exercise> workout = user.getWorkout().getAllExercises();
        Exercise first = workout.get(0);
        Exercise second = workout.get(1);
        Exercise third = workout.get(2);

        String one = first.getName() + " | Weight: " + first.getWeight() + " x " + first.getReps() + " reps";
        String two = second.getName() + " | Weight: " + second.getWeight() + " x " + second.getReps() + " reps";
        String three = third.getName() + " | Weight: " + third.getWeight() + " x " + third.getReps() + " reps";
        String a = "CURRENT:" + "\n" + one + "\n" + two + "\n" + three;
        currentLabel.setText(a);

        one = first.getName() + " | Weight: " + (first.getWeight() - 5) + " x " + first.getReps() + " reps";
        two = second.getName() + " | Weight: " + (second.getWeight() - 5) + " x " + second.getReps() + " reps";
        three = third.getName() + " | Weight: " + (third.getWeight() - 5) + " x " + third.getReps() + " reps";
        a = "CURRENT:" + "\n" + one + "\n" + two + "\n" + three;
        recentLabel.setText(a);

        one = first.getName() + " | Weight: " + (first.getWeight() + 5) + " x " + first.getReps() + " reps";
        two = second.getName() + " | Weight: " + (second.getWeight() + 5) + " x " + second.getReps() + " reps";
        three = third.getName() + " | Weight: " + (third.getWeight() + 5) + " x " + third.getReps() + " reps";
        a = "CURRENT:" + "\n" + one + "\n" + two + "\n" + three;
        futureLabel.setText(a);


    }//sets the values to the correct things.


    public void setHandlers() {
        recentLabel.setOnMouseClicked(e -> {
            goToMostRecent();
        });
        currentLabel.setOnMouseClicked(e -> {
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
