package ss12_java_collection_framework.bai_tap.model;

public class Product implements Comparable<Product> {
    private int id;
    private String nameProduct;
    private int money;

    public Product(int id, String name, String place, double price, String color) {
    }

    public Product(int id, String nameProduct, int money) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.money = money;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nameProduct='" + nameProduct + '\'' +
                ", money=" + money +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return (this.money - o.money);
    }
}
