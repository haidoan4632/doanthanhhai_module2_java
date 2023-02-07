package ss17_binary_file_serilalization.thuc_hanh.demo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ByteStream {
    private static final String FILT_PATH = "E:\\doanthanhhai_module2_java\\src\\ss17_binary_file_serilalization\\thuc_hanh\\demo\\student.dat";

    public static void writeObject(Student student) throws IOException {
        FileOutputStream fos = new FileOutputStream(FILT_PATH);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(student);
        oos.close();
    }

    public static Student readObject() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(FILT_PATH);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student student = (Student) ois.readObject();
        return student;
    }

    public static void writeObjectList(List<Student> studentList) throws IOException {
        FileOutputStream fos = new FileOutputStream(FILT_PATH);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(studentList);
        oos.close();
    }

    public static List<Student> readObjectList() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(FILT_PATH);
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<Student> studentList = (List<Student>) ois.readObject();
        return studentList;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student1 = new Student(1, "A", 9.9);
        Student student2 = new Student(2, "B", 8.9);
        Student student3 = new Student(3, "C", 7.9);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        writeObjectList(studentList);

        List<Student> result = readObjectList();
        for (Student student : result) {
            System.out.println(student);
        }


    }

}
