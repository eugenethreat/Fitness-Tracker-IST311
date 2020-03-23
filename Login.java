
public class Login {
    UserInfo user;
    
    public Login(UserInfo user){
        this.user = user;
    }

    public UserInfo getUser() {
        return user;
    }

    public void setUser(UserInfo user) {
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
