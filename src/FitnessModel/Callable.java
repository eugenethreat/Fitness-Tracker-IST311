package FitnessModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Callable {
    // write your code here

    private static String dbuser = "root";
    private static String password = "toor";
    private static String protocol = "jdbc:derby://localhost:1527/Fitness;";

    private static Connection conn;

    public static Connection callToDb() throws SQLException {
        try {
            conn = DriverManager.getConnection(protocol, dbuser, password);
        } catch (SQLException ex) {
            Logger.getLogger(Callable.class.getName()).log(Level.SEVERE, null, ex);
        }

        return conn;

    }

    public static ResultSet getAllUsers() {
        ResultSet res = null;
        try {
            conn = DriverManager.getConnection(protocol, dbuser, password);
            Statement st = conn.createStatement();
            res = st.executeQuery("SELECT * FROM USERS");

        } catch (SQLException ex) {
            Logger.getLogger(Callable.class.getName()).log(Level.SEVERE, null, ex);
        }

        return res;
    }

    public static ResultSet getWorkout(User user) {
        ResultSet res = null;

        int idToGet = user.getId();
        //get the workout corresponding with the user ID;  
        String stringValToGet = String.valueOf(idToGet);

        try {
            conn = DriverManager.getConnection(protocol, dbuser, password);
            Statement st = conn.createStatement();
            res = st.executeQuery("SELECT * FROM WORKOUTS WHERE ID=" + stringValToGet);

        } catch (SQLException ex) {
            Logger.getLogger(Callable.class.getName()).log(Level.SEVERE, null, ex);
        }

        return res;

    }

    public static void createNewUser(User user) {
        System.out.println("go to createnewuser");

        try {

            System.out.println("inserting new user");

            conn = DriverManager.getConnection(protocol, dbuser, password);
            Statement st = conn.createStatement();

            //String sql = "INSERT INTO USERS VALUES (12, 'amber', '1234')"; 
            //String sql =  INSERT INTO USERS VALUES (4, 'asdfasdf', asdfasdfasdf')
            //I realized here I was missing ... a single ' before the password. 
            String prefix = "INSERT INTO USERS VALUES (";

            ResultSet allUsers = getAllUsers();
            int id = 0;

            while (allUsers.next()) {
                //stuff 
                id++;
            } //getting the last one. very inefficient solution since it parses the whole table. 

            id++; //id of the laste person + 1 

            String sql = id + ", '" + user.getUsername() + "', '" + user.getPassword() + "'";
            String suffix = ")";
            String all = prefix + sql + suffix;
            st.executeUpdate(all);

            //System.out.println("new user inserted");

        } catch (Exception e) {
            Logger.getLogger(Callable.class.getName()).log(Level.SEVERE, null, e);

        }

    }

}
