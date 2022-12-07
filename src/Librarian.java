public class Librarian {
    private String librarianName;
    private int librarianID;
    private String password;

   public Librarian(){}
    public Librarian (String librarianName, int librarianID, String password) {
        this.librarianName = librarianName;
        this.librarianID = librarianID;
        this.password = password;
    }

    public void setLibrarianName (String librarianName) {
        this.librarianName = librarianName;
    }
    public String getLibrarianName () {
        return librarianName;
    }
    public void setLibrarianID (int librarianID) {
        this.librarianID = librarianID;
    }
    public int getLibrarianID () {
        return librarianID;
    }
    public void setPassword (String password) {
        this.password = password;
    }
    public String getPassword () {
        return password;
    }
}
