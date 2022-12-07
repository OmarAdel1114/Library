import java.sql.*;
public class print {
   Connection con ;
    public void showallusers() {

        try {
            con = ConnectionDB.createconnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        String query = "select * from user";
        try {
            Statement stmt = con.createStatement();
            ResultSet resultSet = stmt.executeQuery(query);
            while (resultSet.next()) {
                System.out.format("%d\t%s\t%s\t%s\n",
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4));

                //   "%d\t%s\t%f\t%d\n",
            }
            //  int cnt= pstm.executeUpdate();
            //  if (cnt!=0)
            //    System.out.println("sesssion inserted successsfully!");
        } catch (Exception ex) {
            ex.printStackTrace();
}
}}
