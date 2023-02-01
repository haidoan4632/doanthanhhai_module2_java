package ss12_java_collection_framework.thuc_hanh;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {
    public static void main(String[] args) {
        Map<String,Integer> myMap = new HashMap<>();
        myMap.put("A", 1);
        myMap.put("A", 2);
        myMap.put(null, 99);

Student student = new Student(3,"doãn hải");
Student student1 = new Student(4,"doãn thanh hải");
Student student2 = new Student(5,"doãn hải nè");
Map<Student,Integer> myMap1 = new HashMap<>();
myMap1.put(student,10);
myMap1.put(student1,100);
myMap1.put(student2,1000);

for (Student key: myMap1.keySet()){
    System.out.println(key + " - "+ myMap1.get(key));
}
    }

}
