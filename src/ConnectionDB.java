import java.sql.*;


public class ConnectionDB {


        static    Connection con;
        public static Connection createconnection()  {

            try {

                Class.forName("com.mysql.jdbc.Driver");
                String url="jdbc:mysql://127.0.0.1:3306/library_system";
                  String username="root";
                String password="OMARdola160";
                con = DriverManager.getConnection(url, username, password);

            }
            catch (Exception ex){
                ex.printStackTrace();
            }
            return con;

    }
}
//127.0.0.1

