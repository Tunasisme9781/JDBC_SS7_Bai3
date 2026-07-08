public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.studentId = "SV001";
        student1.studentName = "Nguyễn Văn A";
        student1.age = 20;

        Student student2 = new Student();
        student2.studentId = "SV002";
        student2.studentName = "Trần Thị B";
        student2.age = 21;

        student1.displayData();
        System.out.println(); 
        student2.displayData();
    }
}
