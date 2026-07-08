public class Main {
    public static void main(String[] args) {
        // 1. Khởi tạo đối tượng sinh viên thứ nhất
        Student student1 = new Student();
        // Gán giá trị trực tiếp cho các thuộc tính của student1
        student1.studentId = "SV001";
        student1.studentName = "Nguyễn Văn A";
        student1.age = 20;

        // 2. Khởi tạo đối tượng sinh viên thứ hai
        Student student2 = new Student();
        // Gán giá trị trực tiếp cho các thuộc tính của student2
        student2.studentId = "SV002";
        student2.studentName = "Trần Thị B";
        student2.age = 21;

        // 3. Gọi phương thức hiển thị dữ liệu của từng sinh viên
        student1.displayData();
        System.out.println(); // In một dòng trống cho dễ nhìn giữa 2 sinh viên
        student2.displayData();
    }
}