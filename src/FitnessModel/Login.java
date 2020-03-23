package FitnessModel;

import FitnessModel.User;

public class Login {
    User user;
    
    public Login(User user){
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    public void test(String username, String password){
        if(username.equals(user.getUsername()) && password.equals(user.getPassword())){
            System.out.println("Welcome!");
        }
        else if(!username.equals(user.getUsername())){
            System.out.println("Incorrect credentials.");
        }
        else if(!password.equals(user.getPassword())){
            System.out.println("Incorrect credentials.");
        }
        else if(!password.equals(user.getPassword()) && !username.equals(user.getUsername())){
            System.out.println("Incorrect credentials.");
            
        }
    }
}
