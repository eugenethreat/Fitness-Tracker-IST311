package FitnessModel;

import FitnessModel.User;

import java.util.ArrayList;

public class Login {

    ArrayList<User> testUsers = new ArrayList<User>();

    public Login(){
        makeSomeArbitraryUsers();
    }//this class checks entered credentials

    private void makeSomeArbitraryUsers() {
        User someUser1 = new User("eugener", "1234");
        User someUser2 = new User("Nick Hunter", "1234");
        User someUser3 = new User("Noelle Fajt", "5678");
        User someUser4 = new User("Wilson Hafner", "1010");

        testUsers.add(someUser1);
        testUsers.add(someUser2);
        testUsers.add(someUser3);
        testUsers.add(someUser4);
    }

    public void test(User user){
        //todo : check credentials from the passed user.
    }
}
