package FitnessModel;

import java.util.ArrayList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Login {

    public static ArrayList<User> testUsers = new ArrayList<User>();

    public Login() {
    }//this class checks entered credentials

    public boolean test(User user) {
        boolean exists = false;

        try {
            String dbuser = "root";
            String password = "toor";
            String protocol = "jdbc:derby://localhost:1527/Fitness;";
            Connection conn = DriverManager.getConnection(protocol, dbuser, password);
            //conecting to the db 

            Statement st = conn.createStatement();
            ResultSet res = st.executeQuery("SELECT * FROM USERS");
            //gets results from teh db and saves them 

            while (res.next()) {
                User fromDb = new User(res.getString(2), res.getString(3));
                //serializing into a user object - 2 is username, 3 is password
                hardcodeWorkouts(fromDb);
                testUsers.add(fromDb); //adding to static list  

            }
            res.close();
            conn.close(); //cleaning up 

            for (int i = 0; i < testUsers.size(); ++i) {
                if (user.getUsername().equals(testUsers.get(i).getUsername())) {

                    if (user.getPassword().equals(testUsers.get(i).getPassword())) {
                        exists = true;
                    }

                }
            }//checks if the credentials are correct; 
            //if the username is equal, checks the password. else, exits.

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

        return exists;
    }

    public void hardcodeWorkouts(User fromDb) {
        Exercise a = new Exercise("squat", 10, 10);
        Exercise b = new Exercise("leg press", 10, 10);
        Exercise c = new Exercise("some arm thing", 10, 10);
        Workout w = new Workout(a, b, c);
        fromDb.setWorkout(w);

    }   //hardcoding workouts for demo purposess 

}
