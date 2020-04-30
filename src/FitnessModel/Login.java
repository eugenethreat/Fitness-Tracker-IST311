package FitnessModel;

import java.util.ArrayList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Login {

    public static ArrayList<User> testUsers = new ArrayList<User>();

    public Login() {
        makeSomeArbitraryUsers();
    }//this class checks entered credentials

    private void makeSomeArbitraryUsers() {
        User someUser1 = new User("eugene", "1234");
        User someUser2 = new User("Nick Hunter", "1234");
        User someUser3 = new User("Noelle Fajt", "5678");
        User someUser4 = new User("Wilson Hafner", "1010");
        //later, these will be stored in a database.

        Exercise a = new Exercise("squat", 10, 10);
        Exercise b = new Exercise("leg press", 10, 10);
        Exercise c = new Exercise("some arm thing", 10, 10);
        Workout w = new Workout(a, b, c);
        someUser1.setWorkout(w);
        //TEST METHODS - WILL BE MOVED LATER

        testUsers.add(someUser1);
        testUsers.add(someUser2);
        testUsers.add(someUser3);
        testUsers.add(someUser4);
    }

    public boolean test(User user) {
        boolean exists = false;

        try {
            //todo : check credentials from the passed user.

            //Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            
            String dbuser = "root";
            String password = "toor";
            String protocol = "jdbc:derby:";
            String fitness = "//localhost:1527/Fitness;";
            Connection conn = DriverManager.getConnection(protocol + fitness, dbuser, password);

            
            
            
            
            for (int i = 0; i < testUsers.size(); ++i) {
                if (user.getUsername().equals(testUsers.get(i).getUsername())) {

                    if (user.getPassword().equals(testUsers.get(i).getPassword())) {
                        exists = true;
                    }

                }
            }//if the username is equal, checks the password. else, exits.

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return exists;
    }

}
