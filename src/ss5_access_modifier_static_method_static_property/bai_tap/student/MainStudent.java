package ss5_access_modifier_static_method_static_property.bai_tap.student;

public class MainStudent {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Name : " + student.getName());
        System.out.println("Class : " + student.getClasses());
        Student student1 = new Student("Hokage đệ thất Uzumaki Naruto", "Làng lá");
        System.out.println("Name : " + student1.getName());
        System.out.println("Class : " + student1.getClasses());
    }
}
