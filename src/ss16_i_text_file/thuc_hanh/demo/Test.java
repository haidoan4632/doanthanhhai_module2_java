package ss16_i_text_file.thuc_hanh.demo;

import java.io.IOException;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
//        Student student1 = new Student(1, "A", 9.9);
//        Student student2 = new Student(2, "B", 5.6);
//        Student student3 = new Student(3, "C", 10);
        List<Student> studentList = FileUtil.readCSV();
        for (Student student : studentList) {
            System.out.println(student);
        }

        Student studentNew = new Student(5,"D",9.9);
        FileUtil.writeCSV(studentNew);
    }
}
