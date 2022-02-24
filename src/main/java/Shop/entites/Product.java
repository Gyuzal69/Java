package Shop.entites;

public class Product {
    private int id;
    private String name;
    private int price;
    private String localdate;

    public Product(){}

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Product(int id, String name, int price, String localdate) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.localdate = localdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getLocaldate() {
        return localdate;
    }

    public void setLocaldate(String localdate) {
        this.localdate = localdate;
    }
}
