public class User {
    private String userName;
    private int userID;
    private String password;

    public User (String userName, int userID, String password) {
        this.userName = userName;
        this.userID = userID;
        this.password = password;
    }
    public void setUserName (String userName) {
        this.userName = userName;
    }
    public String getUserName () {
        return userName;
    }
    public void setUserID (int userID) {
        this.userID = userID;
    }
    public int getUserID () {
        return userID;
    }
    public void setPassword (String password) {
        this.password = password;
    }
    public String getPassword () {
        return password;
    }
}
