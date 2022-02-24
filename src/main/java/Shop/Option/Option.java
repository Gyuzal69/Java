package Shop.Option;

import Shop.DataBase.DB;
import Shop.entites.Product;

import java.sql.*;
import java.util.Scanner;

public class Option {
    DB db = new DB();
    Scanner scanner = new Scanner(System.in);
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
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            System.out.println( resultSet.getString(1) + " " + resultSet.getString(2) + " " +resultSet.getString(3) + " " + resultSet.getString(4));
        }
    }

    public void addRODUCT(Product p) throws SQLException {
        Connection connection = db.getConnect();
        PreparedStatement preparedStatement = connection.prepareStatement("insert into menu(id , name , price , localdate) values (?, ? , ? , ?)");
        preparedStatement.setInt(1 , p.getId());
        preparedStatement.setString(2 , p.getName());
        preparedStatement.setInt(3 , p.getPrice());
        preparedStatement.setString(4 , p.getLocaldate());
        preparedStatement.executeUpdate();
    }

    public void ChangePrice() throws SQLException {
        Connection connection = db.getConnect();
        int price = scanner.nextInt();
        PreparedStatement preparedStatement = connection.prepareStatement("insert into menu where price = '" + price+  "'");
        preparedStatement.executeUpdate();
    }
    public void removePRODUCT() throws SQLException {
        Connection connection = db.getConnect();
        String name = scanner.next();
        PreparedStatement preparedStatement = connection.prepareStatement("delete from menu where name = '"+ name +"'");
        preparedStatement.executeUpdate();
    }



}
