package FitnessController;

import FitnessModel.User;
import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main extends Application {

    public static void main(String[] args) {
        Application.launch(Main.class, (java.lang.String[]) null);

    } //deafult launch method for fxml application

    private Stage stage;
    private User loggedUser;

    @Override
    public void start(Stage firstStage) throws Exception {

        try {
            stage = firstStage;
            stage.setTitle("fitness group project");
            stage.show();

            LoginController ft = (LoginController) replaceSceneContent("LoginController.fxml");
            ft.setApp(this);

        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void gotoHome() {
        try {
            HomepageController home = (HomepageController) replaceSceneContent("HomepageController.fxml");
            home.setUsernameField(loggedUser.getUsername());
            home.setApp(this);

        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void gotoHome(User logged) { //for first time login, sets the loggeduser.
        try {
            loggedUser = logged;
            HomepageController home = (HomepageController) replaceSceneContent("HomepageController.fxml");
            home.setUsernameField(loggedUser.getUsername());
            home.setApp(this);

        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void gotoSurvey() {
        try {
            goalSurvey goals = (goalSurvey) replaceSceneContent("SkillLevel.fxml");
            goals.setApp(this);

        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void gotoWorkout() {
        try {
            CreateAWorkoutController workout = (CreateAWorkoutController) replaceSceneContent("CreateAWorkout.fxml");
            workout.setApp(this);

        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void gotoExercise(String type) {
        try {
            SelectExerciseController exercise = (SelectExerciseController) replaceSceneContent("SelectExercise.fxml");
            exercise.getExerciseType(type);
            exercise.setApp(this);

        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void goToWorkout() {
        try {
            WorkoutsController workouts = (WorkoutsController) replaceSceneContent("workouts.fxml");
            workouts.setApp(this);
            workouts.setHandlers();
            workouts.setWorkoutFields();

        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    private Initializable replaceSceneContent(String fxml) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        InputStream in = Main.class.getResourceAsStream(fxml);
        loader.setBuilderFactory(new JavaFXBuilderFactory());
        loader.setLocation(Main.class.getResource(fxml));
        AnchorPane page;
        try {
            page = loader.load(in);
        } finally {
            in.close();
        }

        Scene scene = new Scene(page, 500, 800);
        stage.setScene(scene);
        stage.sizeToScene();
        return (Initializable) loader.getController();
    }


    public void goToRecent() {
    }

    public void goToCurrent() {
        try {
            CurrentWorkoutController current = (CurrentWorkoutController) replaceSceneContent("CurrentWorkout.fxml");
            current.setApp(this);

        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void goToFuture() {
    }

    public User getLoggedUser() {
        System.out.println("emmy");
        return loggedUser;
    }

    public void setLoggedUser(User toTest) {
        loggedUser = toTest;
    }
}
