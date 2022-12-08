public class User {
    private int userID;
    private String user_Fname,user_Lname;

    private String user_pass;

    public User() {
    }

    public User (String user_Fname, String user_Lname, int userID, String user_pass) {
        this.user_Fname = user_Fname;
        this.user_Lname = user_Lname;
        this.userID = userID;
        this.user_pass = user_pass;
    }
    public void setUserFname (String user_Fname) {
        this.user_Fname = user_Fname;
    }
    public void setUserLname(String user_Lname){
        this.user_Lname= user_Lname;
    }
    public String getUserFname () {

        return user_Fname ;
    }
    public String getUserLname(){
        return user_Lname;
    }
    public void setUserID (int userID) {
        this.userID = userID;
    }
    public int getUserID () {
        return userID;
    }
    public void setPassword (String user_pass) {

        this.user_pass = user_pass;
    }
    public String getPassword () {
        return user_pass;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_Fname='" + user_Fname + '\'' +
                ", user_Lname='" + user_Lname + '\'' +
                ", userID=" + userID +
                ", user_pass='" + user_pass + '\'' +
                '}';
    }
}
