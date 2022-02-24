package Shop.DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {

    public Connection getConnect(){
        String url = "jdbc:postgresql://localhost:5432/postgres";
        try{
            Connection connection = DriverManager.getConnection(url , "postgres" , "root");
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
