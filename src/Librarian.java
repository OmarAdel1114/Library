public class Librarian {
    private String librarian_name;
    private int librarianID;
    private String librarian_pass;

   public Librarian(){}
    public Librarian (String librarian_name, int librarianID, String librarian_pass) {
        this.librarian_name = librarian_name;
        this.librarianID = librarianID;
        this.librarian_pass = librarian_pass;
    }

    public void setLibrarianName (String librarian_name) {
        this.librarian_name = librarian_name;
    }
    public String getLibrarianName () {
        return librarian_name;
    }
   /* public void setLibrarianID (int librarianID) {
        this.librarianID = librarianID;
    }*/
    public int getLibrarianID () {
        return librarianID;
    }
    public void setPassword (String librarian_pass) {
        this.librarian_pass = librarian_pass;
    }
    public String getPassword () {
        return librarian_pass;
    }
}
