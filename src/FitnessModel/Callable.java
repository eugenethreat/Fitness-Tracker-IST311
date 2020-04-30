package FitnessModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class Callable {
    // write your code here

    public void callToDb(){

        Connection conn = null;
        try {
            /*
            TODO: REPLACE THESE WITH NON-LOCAL SQL INSTANCE
            
            user: root
            pw: toor
            
            */
            String url = "jdbc:mysql://localhost:3306/";
            String user = "";
            String password = "";
            //credentials removed

            conn = DriverManager.getConnection(url,user,password);
            //opens the connection to the db
            System.out.println("Got it!");
            //confirms the connection

            String sql = "INSERT into person " + "VALUES ()";
            String query = sql;
                //where QUERY takes values from the call

            Statement stmt = conn.createStatement();
            stmt.executeUpdate(query);

            System.out.println("all done");


        } catch (SQLException e) {
            throw new Error("Problem", e);
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex){
                System.out.println(ex.getMessage());
            } }

    }


}
