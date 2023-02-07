package ss17_binary_file_serilalization.bai_tap.copy_file;

import java.io.*;
import java.util.List;

public class CopyFile {
    private static final String FILE_PATH = "E:\\doanthanhhai_module2_java\\src\\ss17_binary_file_serilalization\\bai_tap\\copy_file\\source.dat";
    private static final String FILE_PATH1 = "E:\\doanthanhhai_module2_java\\src\\ss17_binary_file_serilalization\\bai_tap\\copy_file\\targer.dat";

    public static void copyFile() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(FILE_PATH);
        ObjectInputStream ois = new ObjectInputStream(fis);
        FileOutputStream fos = new FileOutputStream(FILE_PATH1);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        List list = (List) ois.readObject();
        oos.writeObject(list);
        ois.close();
        oos.close();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        copyFile();
    }


}
