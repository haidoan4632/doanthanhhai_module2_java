package ss16_i_text_file.bai_tap.copy_file_text;

import java.io.*;

public class CopyFile {
    public static final String FILE_PATH1 = "E:\\doanthanhhai_module2_java\\src\\ss16_i_text_file\\bai_tap\\copy_file_text\\source_file.csv";
    public static final String FILE_PATH2 = "E:\\doanthanhhai_module2_java\\src\\ss16_i_text_file\\bai_tap\\copy_file_text\\target_file.csv";

    public static void readList() {
        FileReader fileReader;
        BufferedReader buff = null;
        try {
            FileWriter fileWriter = new FileWriter(FILE_PATH2);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            fileReader = new FileReader(FILE_PATH1);
            buff = new BufferedReader(fileReader);
            String line;
            while ((line = buff.readLine()) != null) {
                bufferedWriter.write(line + "\n");

            }
            bufferedWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                assert buff != null;
                buff.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        readList();
    }
}
