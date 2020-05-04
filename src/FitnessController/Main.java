package FitnessController;

import FitnessModel.User;
import FitnessModel.Workout;
import FitnessModel.WorkoutGenerator;

import FitnessController.GoalSurveyController;
import FitnessModel.Callable;
import static FitnessModel.Callable.getAllUsers;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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

    public void goToHome() {
        try {
            HomepageController home = (HomepageController) replaceSceneContent("HomepageController.fxml");
            home.setUsernameField(loggedUser.getUsername());
            home.setApp(this);

        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void goToHome(User logged) { //for first time login, sets the loggeduser.
        try {
            loggedUser = logged;
            HomepageController home = (HomepageController) replaceSceneContent("HomepageController.fxml");
            home.setUsernameField(loggedUser.getUsername());
            home.setApp(this);

        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void goToSurvey() {
        try {
            System.out.println(":D :D :D :D:D ");

            GoalSurveyController goals = (GoalSurveyController) replaceSceneContent("GoalSurveyController.fxml");
            goals.setApp(this);

        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    void goToCreateWorkout(boolean cardio, String level) {

        try {

            WorkoutGenerator gen = new WorkoutGenerator(cardio, level);
            Workout newWorkout = gen.makeWorkoutForNewUser();

            System.out.println("workout " + newWorkout);

            ResultSet allUsers = Callable.getAllUsers();
            int id = 0;

            try {
                while (allUsers.next()) {
                    //stuff
                    id++;
                } //getting the last one. very inefficient solution since it parses the whole table.
            } catch (SQLException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }

            //id++; //id of the laste person + 1
            String prefix = "SELECT * FROM USERS WHERE ID=" + id;
            //  ("SELECT * FROM WORKOUTS WHERE ID=" + stringValToGet);

            Connection conn = Callable.callToDb();
            Statement st = conn.createStatement();

            ResultSet res;
            res = st.executeQuery(prefix);

            while (res.next()) {

                String username = res.getString(2);
                String password = res.getString(3);
                User newlyLoggedUser = new User(username, password);

                //needs to be set to the last user, since the last will be the most recent.
                this.setLoggedUser(newlyLoggedUser);
                System.out.println(" user " + this.getLoggedUser().toString());

                this.getLoggedUser().setWorkout(newWorkout);

                this.goToHome(newlyLoggedUser);

            }

        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void goToCreateWorkout() {
        try {

            //CreateAWorkoutController workout = (CreateAWorkoutController) replaceSceneContent("CreateAWorkout.fxml");
            //workout.setApp(this);
            /*
            should be changed to generate a workout and go to the homescreen 
            for it to be viewed 
             */
            this.goToHome();

        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void goToSelectExercise(String type) {
        try {
            SelectExerciseController exercise = (SelectExerciseController) replaceSceneContent("SelectExercise.fxml");
            exercise.getExerciseType(type);
            exercise.setApp(this);

        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void goToAllWorkouts() {
        try {
            AllWorkoutsController workouts = (AllWorkoutsController) replaceSceneContent("AllWorkouts.fxml");
            workouts.setApp(this);
            workouts.setHandlers();
            workouts.setWorkoutFields();

        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void goToDropDown() {
        try {
            CreateWorkoutDropdownController drop = (CreateWorkoutDropdownController) replaceSceneContent("CreateWorkoutDropdown.fxml");
            drop.setApp(this);

        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void goToRecent() {
        //todo
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
        //todo
    }

    public void goToNewAccount() {
        try {
            NewUserScreenController newAccount = (NewUserScreenController) replaceSceneContent("NewUserScreen.fxml");
            newAccount.setApp(this);

        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void goToLogin() {
        try {
            LoginController ft = (LoginController) replaceSceneContent("LoginController.fxml");
            ft.setApp(this);

        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void goToProgression() {
        try {
            ProgressionChartController chart = (ProgressionChartController) replaceSceneContent("ProgressionChart.fxml");
            chart.setApp(this);
            chart.setGraph();

        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public User getLoggedUser() {
        return loggedUser;
    }

    public void setLoggedUser(User toTest) {
        loggedUser = toTest;
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

}
