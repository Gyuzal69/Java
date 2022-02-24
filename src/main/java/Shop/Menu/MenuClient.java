package Shop.Menu;

import Shop.Option.Option;
import Shop.entites.Product;

import java.sql.SQLException;
import java.util.Scanner;

public class MenuClient {
    public void showMenu() throws SQLException {

        Scanner scanner = new Scanner(System.in);
        Option option = new Option();
        int command = -1 ;
        while (command !=0){
            System.out.println("watch product : enter 1");
            System.out.println("take a product : enter 2");

            command = scanner.nextInt();
            switch (command){
                case 1 :
                    System.out.println(" ");
                    option.watchAllProduct();
                    break;
                case 2 :
                    System.out.println(" ");
                    System.out.println("enter id");
                    int id = scanner.nextInt();
                    System.out.println(" enter name");
                    String name = scanner.next();
                    Product product = new Product(id , name);
                    option.busket(product);
                    break;
            }



        }
    }
}
