class Student {
    // Các thuộc tính cơ bản (từ Bài tập 1)
    String studentId;
    String studentName;
    int age;

    // Bổ sung phương thức displayData() - Không truyền tham số
    void displayData() {
        System.out.println("=== Thông tin Sinh viên ===");
        System.out.println("Mã sinh viên: " + studentId);
        System.out.println("Tên sinh viên: " + studentName);
        System.out.println("Tuổi: " + age);
    }
}