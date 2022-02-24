package Shop;

import Shop.DataBase.DB;
import Shop.Menu.MenuAdmin;
import Shop.Menu.MenuClient;
import Shop.Option.Option;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        DB db= new DB();
        db.getConnect();
        Option option = new Option();
        MenuClient menuClient = new MenuClient();
        MenuAdmin menuAdmin = new MenuAdmin();
//        menuClient.showMenu();
        System.out.println(" admin enter 1 ");
        System.out.println(" client enter 2");
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        if(c == 1){

        }
        if(c == 2){
            menuClient.showMenu();
        }
    }
}
