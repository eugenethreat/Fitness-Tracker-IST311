package FitnessModel;

import java.util.ArrayList;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Login {

    public static ArrayList<User> testUsers = new ArrayList<User>();

    public Login() {
    }//this class checks entered credentials

    public boolean test(User user) {
        boolean exists = false;

        try {

            ResultSet res = Callable.getAllUsers();
            //cleaning up db code 

            //gets results from teh db and saves them 
            while (res.next()) {
                User fromDb = new User(res.getString(2), res.getString(3));
                fromDb.setId(Integer.parseInt(res.getString(1)));
                //serializing into a user object - 2 is username, 3 is password
                testUsers.add(fromDb); //adding to static list

                hardcodeWorkouts(fromDb);
                //adding the workout 

            }
            res.close();
            //cleaning up connection  

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

    public void hardcodeWorkouts(User fromDb) throws SQLException {

        //System.out.println(" :D " + fromDb.getId());

        ResultSet someWorkout = Callable.getWorkout(fromDb);

        //System.out.println("got the rs");

        if (someWorkout.next()) {

            String ex1 = someWorkout.getString(2);
            String ex2 = someWorkout.getString(4);
            String ex3 = someWorkout.getString(6);
            int re1 = Integer.parseInt(someWorkout.getString(3));
            int re2 = Integer.parseInt(someWorkout.getString(5));
            int re3 = Integer.parseInt(someWorkout.getString(7));
            int we1 = Integer.parseInt(someWorkout.getString(8));
            int we2 = Integer.parseInt(someWorkout.getString(9));
            int we3 = Integer.parseInt(someWorkout.getString(10));
            //good code LOL 

            Exercise a = new Exercise(ex1, re1, we1);
            Exercise b = new Exercise(ex2, re2, we2);
            Exercise c = new Exercise(ex3, re3, we3);

            Workout workoutFromDb = new Workout(a, b, c);

            fromDb.setWorkout(workoutFromDb);

        }

    }

}
