import java.sql.Connection;
import java.sql.PreparedStatement;

public class librarianDB implements userINT{
   /* @Override
    public void buy() {
    // remove book_name from book
    }



    @Override
    public void cancelOreder(int ID) {
        // delete request which requestID = ?
    }

    @Override
    public void creatbook() {

    }

    @Override
    public void deletbook(int ID) {

    }*/


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
    public void deleteuser(int ID) {

    }

    @Override
    public void showAllusesrnames(String name) {

    }

}

