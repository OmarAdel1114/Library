import java.sql.*;


public class ConnectionDB {


        static    Connection con;
        public static Connection createconnection() throws SQLException {
            Connection connect = null;
            Statement statement = null;
            PreparedStatement preparedStatement = null;
            ResultSet resultSet = null;

            try {

                // Class.forName("com.mysql.jdbc.Driver");
                //    String url="jdbc:mysql://127.0.0.1:3306/gymdb";
                //   String username="root";
                // String password="root_pass_boody011?";
                //   con=  DriverManager.getConnection(url,username,password);
                String user = "root";
                String password = "OMARdola160";
                String add = "jdbc:mysql://127.0.0.1:3306/library_system";
                //o Connection c;

               /* resultSet = statement.executeQuery("select * from user");
                while (resultSet.next()) {
                    String user_Fname = resultSet.getString(1);
                    String user_Lname = resultSet.getString(2);
                    String user_pass = resultSet.getString(3);*/
                   // System.out.println("Firstname:" + user_Fname + "lastname:" + user_Lname + "pass:" + user_pass);

                    con = DriverManager.getConnection(add, user, password);

            }
            catch (Exception ex){
                ex.printStackTrace();
            }

            return con;

    }
}
//127.0.0.1

