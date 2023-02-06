package ss16_i_text_file.thuc_hanh.demo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
    private static final String FILE_PATH = "E:\\doanthanhhai_module2_java\\src\\ss16_i_text_file\\thuc_hanh\\demo\\file.csv";

    public static List<Student> readCSV() {
        List<Student> studentList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader buff = null;

        try {
            fileReader = new FileReader(FILE_PATH);
            buff = new BufferedReader(fileReader);
            String line;
            String temp[];
            Student student;
            while ((line = buff.readLine()) != null) {
                temp = line.split(",");
                int id = Integer.parseInt(temp[0]);
                String name = temp[1];
                double point = Double.parseDouble(temp[2]);

                student = new Student(id, name, point);
                studentList.add(student);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                buff.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return studentList;
    }

    public static void writeCSV(Student student) throws IOException {
        FileWriter fileWriter = new FileWriter(FILE_PATH, true);
        BufferedWriter buff = new BufferedWriter(fileWriter);
        buff.write(student.getId() + "," + student.getName() + "," + student.getPoint() + "\n");
        buff.close();
    }
}
