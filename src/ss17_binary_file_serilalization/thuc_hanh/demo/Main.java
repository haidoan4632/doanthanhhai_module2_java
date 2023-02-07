package ss17_binary_file_serilalization.thuc_hanh.demo;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student1 = new Student(1, "A", 9.9);
        ByteStream.writeObject(student1);
        System.out.println(ByteStream.readObject());
    }
}
