import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;
        int count = 0;
        double salary;
        double sum = 0;
        double bonus = 0;
        double min = 500_000_000;
        double max = 0;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Nhập lương nhân viên");
            System.out.println("2. Hiển thị thống kê");
            System.out.println("3. Tổng tiền thưởng");
            System.out.println("4. Thoát");
            System.out.print("Lựa chọn: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    while (true) {

                        System.out.print("Nhập lương (-1 để dừng): ");
                        salary = Double.parseDouble(sc.nextLine());

                        if (salary == -1) {
                            break;
                        }

                        if (salary < 0 || salary > 500_000_000) {
                            System.out.println("Lương không hợp lệ!");
                            continue;
                        }

                        count++;
                        sum += salary;

                        if (salary > max)
                            max = salary;

                        if (salary < min)
                            min = salary;

                        // Phân loại thu nhập
                        if (salary < 5_000_000)
                            System.out.println("Thu nhập thấp");
                        else if (salary <= 15_000_000)
                            System.out.println("Thu nhập trung bình");
                        else if (salary <= 50_000_000)
                            System.out.println("Thu nhập khá");
                        else
                            System.out.println("Thu nhập cao");

                        // Tính thưởng
                        if (salary < 5_000_000)
                            bonus += salary * 0.05;
                        else if (salary <= 15_000_000)
                            bonus += salary * 0.10;
                        else if (salary <= 50_000_000)
                            bonus += salary * 0.15;
                        else if (salary <= 100_000_000)
                            bonus += salary * 0.20;
                        else
                            bonus += salary * 0.25;
                    }
                    break;

                case 2:

                    if (count == 0) {
                        System.out.println("Chưa có dữ liệu");
                        break;
                    }

                    System.out.println("\n===== THỐNG KÊ =====");
                    System.out.println("Số nhân viên: " + count);
                    System.out.printf("Lương TB: %.2f\n", sum / count);
                    System.out.printf("Lương cao nhất: %.2f\n", max);
                    System.out.printf("Lương thấp nhất: %.2f\n", min);
                    System.out.printf("Tổng lương: %.2f\n", sum);

                    break;

                case 3:

                    if (count == 0) {
                        System.out.println("Chưa có dữ liệu");
                    } else {
                        System.out.printf("Tổng tiền thưởng: %.2f\n", bonus);
                    }

                    break;

                case 4:
                    System.out.println("Kết thúc chương trình.");
                    System.exit(0);

                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }

        } while (true);
    }
}