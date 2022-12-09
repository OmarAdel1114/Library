import java.sql.*;

public class librarianDB implements userINT,BookINT,requestInt{
    Connection con;
    @Override
    public void creatuser(User us) {
   con = ConnectionDB.createconnection();
    String query ="insert into user values(?,?,?,?)";
        try {
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setInt(1,us.getUserID());
            pstm.setString(2, us.getUserFname());
            pstm.setString(3, us.getUserLname());
            pstm.setString(4, us.getPassword());
          int count = pstm.executeUpdate();
            if (count !=0)
                System.out.println("User added Successfully");
        }catch (Exception ex){
             ex.printStackTrace();
        }
    }

    @Override
    public void deleteuser(String name) {
        con = ConnectionDB.createconnection();
        String query = "delete from user where user_Fname=?";
        try {
            PreparedStatement pstm = con.prepareStatement(query);
           pstm.setString(1,name);
            int count = pstm.executeUpdate();
            if (count!=0)
                System.out.println("User Deleted." +name );
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void showAllusesrnames() {
        con = ConnectionDB.createconnection();
        String query = "select * from user";
        System.out.println("User Details");
        System.out.println("-------------------------------------------------------");
        System.out.format("%s\t%s\t%s\t%s\n","ID","Firstname","Lastname","Password");
        System.out.println("-------------------------------------------------------");
        try {
           Statement stmt = con.createStatement();
           ResultSet result = stmt.executeQuery(query);
           while(result.next()){
           System.out.format("%d\t%s\t%s\t%s\n",
                   result.getInt(1),
                   result.getString(2),
                   result.getString(3),
                   result.getString(4));
            System.out.println("-------------------------------------------------------");}
       }catch (Exception ex){
            ex.printStackTrace();
       }

    }
    public boolean checkavailability(){

        return true;
    };

    @Override
    public void creatbook(Book b1) {
        con = ConnectionDB.createconnection();
        String query ="insert into Book values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement pstm=con.prepareStatement(query);
            pstm.setInt(1, b1.getBookID());
            pstm.setString(2, b1.getBookName());
            pstm.setString(3, b1.getAuthor());
            pstm.setInt(4, b1.getQuantity() );
            pstm.setDouble(5, b1.getPrice());
            pstm.setString(6, b1.getEdition());
            pstm.setString(7, b1.getPublisher());
            int count= pstm.executeUpdate();
            if (count!=0)
                System.out.println("Book Inserted Successfully");
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void deletbook(int Bookid) {
        con = ConnectionDB.createconnection();
        String query ="delete from book where Bookid=?";
        try {
            PreparedStatement pstm=con.prepareStatement(query);
            pstm.setInt(1, Bookid);
            int count= pstm.executeUpdate();
            if (count!=0)
                System.out.println("Book deleted Successfully");
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void showAllbooks() {
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

    @Override
    public void verifyInfo(int userID , String user_pass) {
     /*   try {
            con = ConnectionDB.createconnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }*/
        // delete from user where id=?
        //int id=admin.getId();
        //String pass=admin.getPass();
        //     String
        String query="select * from user where userID=? and user_pass=?";

        try {
            con = ConnectionDB.createconnection();
            //   Statement stmt = con.createStatement();
            //  ResultSet resultSet = stmt.executeQuery(query);
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setInt(1, userID);
            pstm.setString(2, user_pass);
            //    int cnt=pstm.executeUpdate();

            ResultSet rs = pstm.executeQuery();

            if (rs.next())
                System.out.println("login succeseffly");
                //   "%d\t%s\t%f\t%d\n",
            else System.out.println("try again");

            //  int cnt= pstm.executeUpdate();
            //  if (cnt!=0)
            //    System.out.println("sesssion inserted successsfully!");
        } catch (Exception ex) {
            ex.printStackTrace();


}}


    @Override
    public void buy() {

    }

    @Override
    public void cancelOreder(int ID) {

    }
}


