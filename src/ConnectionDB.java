import java.sql.*;


public class ConnectionDB {


        static    Connection con;
        public static Connection createconnection()  {

            try {
                String user ="root";
                String password = "OMARdola160";
                String add ="jdbc:mysql://127.0.0.1:3306/library_system";
                con = DriverManager.getConnection(add, user, password);


            }
            catch (Exception ex){
                ex.printStackTrace();
            }
            return con;

    }
}
//127.0.0.1

