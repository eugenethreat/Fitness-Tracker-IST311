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


    private Main application;


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
            home.setApp(this);

        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void gotoSurvey(){
        try {
            goalSurvey goals = (goalSurvey) replaceSceneContent("SkillLevel.fxml");
            goals.setApp(this);

        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void gotoWorkout(){
        try {
            CreateAWorkoutController workout = (CreateAWorkoutController) replaceSceneContent("CreateAWorkout.fxml");
            workout.setApp(this);

        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void gotoExercise(){
        try {
            
            SelectExerciseController exercise = (SelectExerciseController) replaceSceneContent("SelectExercise.fxml");
            exercise.setApp(this);

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

        Scene scene = new Scene(page, 800, 600);
        stage.setScene(scene);
        stage.sizeToScene();
        return (Initializable) loader.getController();
    }


}
