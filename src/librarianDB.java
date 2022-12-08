import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

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
                   result.getString(4));}
            System.out.println("-------------------------------------------------------");
       }catch (Exception ex){
            ex.printStackTrace();
       }

    }

}

