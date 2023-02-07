package ss17_binary_file_serilalization.bai_tap.model;

import java.io.Serializable;

public class Product implements Serializable {
    int idProduct;
    String nameProduct;
    String placeOfProduct;
    double price;
    String colorOfProduct;

    public Product() {
    }

    public Product(int idProduct, String nameProduct, String placeOfProduct, double price, String colorOfProduct) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.placeOfProduct = placeOfProduct;
        this.price = price;
        this.colorOfProduct = colorOfProduct;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getPlaceOfProduct() {
        return placeOfProduct;
    }

    public void setPlaceOfProduct(String placeOfProduct) {
        this.placeOfProduct = placeOfProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColorOfProduct() {
        return colorOfProduct;
    }

    public void setColorOfProduct(String colorOfProduct) {
        this.colorOfProduct = colorOfProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", nameProduct='" + nameProduct + '\'' +
                ", placeOfProduct='" + placeOfProduct + '\'' +
                ", price=" + price +
                ", colorOfProduct='" + colorOfProduct + '\'' +
                '}';
    }
}
