import java.sql.*;


public class userDB implements requestInt {
    Connection con;
    @Override
    public void verifyInfo(int userID, String user_pass) {
        String query="select * from user where userID=? and user_pass=?";

        try {
            con = ConnectionDB.createconnection();
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setInt(1, userID);
            pstm.setString(2, user_pass);

            ResultSet rs = pstm.executeQuery();

            if (rs.next())
                System.out.println("login succeseffly");

            else System.out.println("try again");
        } catch (Exception ex) {
            ex.printStackTrace();


        }
    }

    @Override
    public void verifyBookName(String book_name) {
        String query="select * from book where book_name=?";

        try {
            con = ConnectionDB.createconnection();
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setString(1,book_name);

            ResultSet rs = pstm.executeQuery();

            if (rs.next())
                System.out.println("book Entered Successfully");
            else System.out.println("try again");
        } catch (Exception ex) {
            ex.printStackTrace();


        }
    }

    @Override
    public void buy(String book_name) {

    }

    @Override
    public void showBookByName(String book_name) {
        con = ConnectionDB.createconnection();
        String query="select * from book where book_name= book_name";
        try{
            Statement stmt= con.createStatement();
            ResultSet result= stmt.executeQuery(query);
            while (result.next()){
                System.out.format("%d\t%s\t%s\t%d\t%f\t%s\t%s\n",
                        result.getInt(1),
                        result.getString(2),
                        result.getString(3),
                        result.getInt(4),
                        result.getDouble(5),
                        result.getString(6),
                        result.getString(7));

            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public void showAllBooks() {
        con = ConnectionDB.createconnection();
        String query = "select * from Book";
        System.out.println("Book Information:");
        System.out.println("-------------------------------------------------------");
        System.out.format("%s\t%s\t%s\t%s\t%s\t%s\t%s\n", "ID", "Name", "Author", "Quantity", "Price"
                , "Edition", "Publisher");
        System.out.println("-------------------------------------------------------");
        try {
            Statement stmt= con.createStatement();
            ResultSet result= stmt.executeQuery(query);
            while (result.next()){
                System.out.format("%d\t%s\t%s\t%d\t%f\t%s\t%s\n",
                        result.getInt(1),
                        result.getString(2),
                        result.getString(3),
                        result.getInt(4),
                        result.getDouble(5),
                        result.getString(6),
                        result.getString(7)
                );
                System.out.println("-------------------------------------------------------");
            }

        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
