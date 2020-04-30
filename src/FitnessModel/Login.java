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
            //todo : check credentials from the passed user.

            //Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            String dbuser = "root";
            String password = "toor";
            String protocol = "jdbc:derby:";
            String fitness = "//localhost:1527/Fitness;";
            Connection conn = DriverManager.getConnection(protocol + fitness, dbuser, password);

            Statement st = conn.createStatement();

            ResultSet res = st.executeQuery("SELECT * FROM USERS");

            while (res.next()) {
                User fromDb = new User(res.getString(2), res.getString(3));

                Exercise a = new Exercise("squat", 10, 10);
                Exercise b = new Exercise("leg press", 10, 10);
                Exercise c = new Exercise("some arm thing", 10, 10);
                Workout w = new Workout(a, b, c);
                fromDb.setWorkout(w);

                testUsers.add(fromDb);

                //2 is username 
                //3 is pw
            }
            res.close();

            for (User u : testUsers) {
                System.out.println(u.getUsername());
            }

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
