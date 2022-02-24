package Shop.Option;

import Shop.DataBase.DB;
import Shop.entites.Product;

import java.sql.*;

public class Option {
    DB db = new DB();
    public void watchAllProduct() throws SQLException {
        Statement connection = db.getConnect().createStatement();
        String sql = "select * from menu";
        ResultSet resultSet = connection.executeQuery(sql);
        while (resultSet.next()){
            System.out.println(resultSet.getString("id") + " " + resultSet.getString("name") + " " + resultSet.getString("price") + " " + resultSet.getString("localdate"));
        }
        while (!resultSet.next()){
            System.err.println(" empty ");
        }
    }
    public void busket(Product product) throws SQLException {
        Connection connection = db.getConnect();
        String sql = "insert into bucket(id , name ) values (? , ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1 , product.getId());
        preparedStatement.setString(2, product.getName());
        preparedStatement.executeUpdate();
    }


}
