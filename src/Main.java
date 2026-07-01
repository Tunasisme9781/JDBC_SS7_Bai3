import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int studentCount;
        int currentIndex = 0;

        System.out.print("Nhập số lượng sinh viên: ");
        studentCount = Integer.parseInt(sc.nextLine());

        Float[] arr = new Float[studentCount];

        for (int i = 0; i < studentCount; i++) {
            System.out.printf("Nhập điểm sinh viên %d: ", currentIndex + 1);
            do {
                try {
                    arr[currentIndex] = Float.parseFloat(sc.nextLine());

                    if (arr[currentIndex] < 0 || arr[currentIndex] > 10) {
                        System.out.print("Điểm phải từ 0 đến 10! Nhập lại: ");
                        continue;
                    }

                    currentIndex++;
                    break;

                } catch (NumberFormatException e) {
                    System.err.print("Điểm phải là số thực! Nhập lại: ");
                }
            } while (true);
        }

        int choice = 0;
        boolean isSorted = false;

        do {

            currentIndex = 0;

            System.out.println("\n************ QUẢN LÝ ĐIỂM SINH VIÊN ************");
            System.out.println("1. Xem tất cả điểm");
            System.out.println("2. Sắp xếp điểm");
            System.out.println("3. Tìm kiếm điểm");
            System.out.println("4. Thống kê điểm");
            System.out.println("5. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");

            switch (choice = Integer.parseInt(sc.nextLine())) {

                case 1:

                    System.out.println("----- DANH SÁCH ĐIỂM -----");

                    for (int i = 0; i < studentCount; i++) {
                        System.out.printf("Điểm sinh viên %d: %.1f\n", currentIndex + 1, arr[currentIndex]);
                        currentIndex++;
                    }

                    break;

                case 2:

                    int sortChoice;

                    System.out.println("1. Sắp xếp tăng dần");
                    System.out.println("2. Sắp xếp giảm dần");
                    System.out.print("Chọn: ");
                    sortChoice = Integer.parseInt(sc.nextLine());

                    if (sortChoice == 1) {

                        for (int i = 0; i < studentCount - 1; i++) {
                            for (int j = 0; j < studentCount - i - 1; j++) {
                                if (arr[j] > arr[j + 1]) {
                                    float temp = arr[j];
                                    arr[j] = arr[j + 1];
                                    arr[j + 1] = temp;
                                }
                            }
                        }

                        System.out.println("Điểm sau khi sắp xếp tăng dần:");

                    } else if (sortChoice == 2) {

                        for (int i = 0; i < studentCount - 1; i++) {
                            for (int j = 0; j < studentCount - i - 1; j++) {
                                if (arr[j] < arr[j + 1]) {
                                    float temp = arr[j];
                                    arr[j] = arr[j + 1];
                                    arr[j + 1] = temp;
                                }
                            }
                        }

                        System.out.println("Điểm sau khi sắp xếp giảm dần:");
                    }

                    for (int i = 0; i < studentCount; i++) {
                        System.out.printf("%.1f ", arr[i]);
                    }

                    System.out.println();

                    isSorted = true;

                    break;

                case 3:

                    int searchChoice;
                    Float score;

                    System.out.println("1. Linear Search");
                    System.out.println("2. Binary Search");
                    System.out.print("Chọn: ");
                    searchChoice = Integer.parseInt(sc.nextLine());

                    System.out.print("Nhập điểm cần tìm: ");
                    score = Float.parseFloat(sc.nextLine());

                    if (searchChoice == 1) {

                        int count = 0;

                        for (int i = 0; i < studentCount; i++) {
                            if (arr[i].equals(score)) {
                                System.out.println("Tìm thấy tại vị trí: " + (i + 1));
                                count++;
                                break;
                            }
                        }

                        if (count == 0) {
                            System.out.println("Linear Search: Không tìm thấy!");
                        }

                    } else if (searchChoice == 2) {

                        if (!isSorted) {
                            System.out.println("Vui lòng sắp xếp mảng trước khi dùng Binary Search!");
                            break;
                        }

                        int left = 0;
                        int right = studentCount - 1;
                        boolean found = false;

                        while (left <= right) {

                            int mid = (left + right) / 2;

                            if (arr[mid].equals(score)) {
                                System.out.println("Tìm thấy tại vị trí: " + (mid + 1));
                                found = true;
                                break;
                            }

                            if (arr[mid] < score) {
                                left = mid + 1;
                            } else {
                                right = mid - 1;
                            }

                        }

                        if (!found) {
                            System.out.println("Binary Search: Không tìm thấy!");
                        }

                    }

                    break;

                case 4:

                    float sumScore = 0;
                    float avgScore;
                    float maxScore;
                    float minScore;
                    int totalStudent = 0;

                    maxScore = arr[0];
                    minScore = arr[0];

                    for (int i = 0; i < studentCount; i++) {

                        sumScore += arr[i];

                        if (arr[i] > maxScore) {
                            maxScore = arr[i];
                        }

                        if (arr[i] < minScore) {
                            minScore = arr[i];
                        }

                    }

                    avgScore = sumScore / studentCount;

                    for (int i = 0; i < studentCount; i++) {
                        if (arr[i] > avgScore) {
                            totalStudent++;
                        }
                    }

                    System.out.printf("Điểm trung bình: %.2f\n", avgScore);
                    System.out.printf("Điểm cao nhất: %.1f\n", maxScore);
                    System.out.printf("Điểm thấp nhất: %.1f\n", minScore);
                    System.out.printf("Số sinh viên trên trung bình: %d\n", totalStudent);

                    break;

                case 5:

                    System.out.println("Kết thúc chương trình!");
                    System.exit(0);

                default:

                    System.out.println("Lựa chọn không hợp lệ!");

            }

        } while (true);

    }
}