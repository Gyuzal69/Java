package Shop;

import Shop.DataBase.DB;
import Shop.Menu.MenuClient;
import Shop.Option.Option;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        DB db= new DB();
        db.getConnect();
        MenuClient menuClient = new MenuClient();
        menuClient.showMenu();
    }
}
