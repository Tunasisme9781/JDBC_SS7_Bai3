import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int employeeCount;
        int currentIndex = 0;

        System.out.println("Nhập số lượng nhân viên: ");
        employeeCount = Integer.parseInt(sc.nextLine());
        Float[] arr = new Float[employeeCount];
        for(int i = 0; i < employeeCount; i++)
        {
            System.out.printf("Nhập lương nhân viên %d: ",currentIndex+1);
            do {
                try {
                    arr[currentIndex] = Float.parseFloat(sc.nextLine());
                    currentIndex++;
                    break;

                }catch (NumberFormatException e){
                    System.err.print("\nLương phải là số thực! Nhập lại: \n");
                }
            }while (true);

        }
        int choice = 0;

        do {

            currentIndex=0;
            System.out.println("************ QUẢN LÝ LƯƠNG NHÂN VIÊN ************");
            System.out.println("1. Xem danh sách lương");
            System.out.println("2. Sắp xếp lương");
            System.out.println("3. Tìm kiếm lương cụ thể");
            System.out.println("4. Thống kê lương");
            System.out.println("5. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");

            switch (choice = Integer.parseInt(sc.nextLine())) {
                case 1:
                    System.out.println("----- DANH SÁCH LƯƠNG -----");
                    for(int i = 0; i < employeeCount; i++){
                        System.out.printf("Lương của nhân viên %d là: %.1f \n", currentIndex+1,arr[currentIndex]);
                        currentIndex++;
                    }
                    break;
                case 2:

                    System.out.println("Lương sắp xếp theo tăng dần: ");
                    Arrays.sort(arr);
                    System.out.println(Arrays.toString(arr));
                    break;

                case 3:
                    boolean found = false;
                    int count =0;
                    Float salary;
                    System.out.println("Nhập số lương cần tìm: ");
                    salary = Float.parseFloat(sc.nextLine());
                    for (int i = 0; i < employeeCount; i++){
                        if(arr[i].equals(salary))
                        {count ++;
                            break;
                        }
                    }
                    if(count >0)
                        System.out.println("Tìm thấy lương của nhân viên!");

                        else System.out.println("Linear Search: Không tìm thấy");
                    break;

                case 4:
                    float sumSalary = 0;
                    float avgSalary;
                    float maxSalary;
                    float minSalary;
                    int totalEmployee = 0;
                    Arrays.sort(arr);

                    for(int i =0 ; i< employeeCount;i++)
                    {
                        sumSalary += arr[currentIndex];
                        currentIndex++;
                    }
                    maxSalary = arr[currentIndex-1];
                    minSalary = arr[0];
                    avgSalary = sumSalary/employeeCount;
                    for(int i =0 ; i< employeeCount;i++)
                    {
                        if(arr[i] > avgSalary)
                            totalEmployee++;
                    }
                    System.out.printf("Tổng lương: %.1f\n", sumSalary);
                    System.out.printf("Lương trung bình: %f\n", avgSalary);
                    System.out.printf("Lương cao nhất: %.1f\n", maxSalary);
                    System.out.printf("Lương thấp nhất: %.1f\n", minSalary);
                    System.out.printf("Số nhân viên có lương trên trung bình: %d\n", totalEmployee);
                    break;

                case 5:
                    System.out.println("Kết thúc chương trình!");
                    System.exit(0);
            }


        }while (true);

    }
}