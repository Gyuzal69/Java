package Shop.Menu;

import Shop.DataBase.DB;
import Shop.Option.Option;
import Shop.entites.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MenuAdmin {
    DB db = new DB();
Scanner scanner = new Scanner(System.in);

    public void showMenu() throws SQLException {

        Scanner scanner = new Scanner(System.in);
        Option option = new Option();
        int command = -1;
        while (command != 0) {
            System.out.println("add product");
            System.out.println("remove product");
            System.out.println("ChangePrice");

            command = scanner.nextInt();
            switch (command) {
                case 1:
                    System.out.println("id");
                    int id = scanner.nextInt();
                    System.out.println("name");
                    String name = scanner.next();
                    System.out.println("price");
                    int price = scanner.nextInt();
                    System.out.println("localdate");
                    String localdate = scanner.next();
                    Product product = new Product(id , name , price , localdate);
                    Option option1 = new Option();
                    option1.addRODUCT(product);
//                    addpRODUCT(product);
                    break;
                case 2:
                    Option option2 = new Option();
                    option2.removePRODUCT();
                    break;
                case 3:
                    Option option3 = new Option();
                    option3.ChangePrice();
            }


        }
    }

//    public void addpRODUCT(Product p) throws SQLException {
//        Connection connection = db.getConnect();
//        PreparedStatement preparedStatement = connection.prepareStatement("insert into menu(id , name , price , localdate) values (?, ? , ? , ?)");
//        preparedStatement.setInt(1 , p.getId());
//        preparedStatement.setString(2 , p.getName());
//        preparedStatement.setInt(3 , p.getPrice());
//        preparedStatement.setString(4 , p.getLocaldate());
//        preparedStatement.executeUpdate();
//    }

//    public void removePRODUCT() throws SQLException {
//        Connection connection = db.getConnect();
//        String name = scanner.next();
//        PreparedStatement preparedStatement = connection.prepareStatement("delete from menu where name = '"+ name +"'");
//        preparedStatement.executeUpdate();
//    }
//    public void ChangePrice() throws SQLException {
//        Connection connection = db.getConnect();
//        int price = scanner.nextInt();
//        PreparedStatement preparedStatement = connection.prepareStatement("insert into menu where price = '" + price+  "'");
//        preparedStatement.executeUpdate();
//    }

}
