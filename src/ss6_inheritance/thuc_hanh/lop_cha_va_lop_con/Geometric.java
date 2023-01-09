package ss6_inheritance.thuc_hanh.lop_cha_va_lop_con;

public class Geometric {
    //các trường dữ liệu
    private String color = "white";
    private String filled = null;
//    các khởi tạo tử
public Geometric(){

}
    public Geometric(String color, String filled) {
        this.color = color;
        this.filled = filled;
    }
//    các thuộc tính

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFilled() {
        return filled;
    }

    public void setFilled(String filled) {
        this.filled = filled;
    }


    public String toString() {
        return "Geometric{" +
                "color='" + color + '\'' +
                ", filled='" + filled + '\'' +
                '}';
    }
}
