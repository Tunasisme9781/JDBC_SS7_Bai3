import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new  Scanner(System.in);
float min ,max  ,mid ,sum = 0;
        float[] arr = new float[0];

int choice , i=0;
float point ;
do {
    System.out.println("\n*********** MENU NHẬP ĐIỂM ***********");
    System.out.println("1.     Nhập điểm học viên");
    System.out.println("2.     Hiển thị thống kê");
    System.out.println("3.     Thoát");
    System.out.println("Lựa chọn của bạn: ");
     choice = Integer.parseInt(sc.nextLine());

    switch (choice) {
        case 1:

            System.out.println("\n--- Nhập điểm học viên (nhập -1 để dừng) ---");

            System.out.print("Nhập điểm: ");
            point = Float.parseFloat(sc.nextLine());

            if(point ==-1) break;
            while (point < 0 || point > 10){
                System.err.print("Điểm không hợp lệ. Nhập lại: ");
                point = Float.parseFloat(sc.nextLine());
            }
            if(0<=point && point < 5) System.out.printf("Học lực: yếu");
            else if(5<=point && point < 7 ) System.out.printf("Học lực: Trung Bình");
            else if(7 <=point && point < 8) System.out.printf("Học lực: Khá");
            else if(8 <=point && point < 9) System.out.printf("Học lực: Giỏi");
            else  System.out.printf("Học lực: Xuất sắc");

            arr = Arrays.copyOf(arr, arr.length + 1);

            arr[arr.length - 1]  = point;
            i++;
            System.out.println(Arrays.toString(arr));            break;

        case 2:
             min = arr[0];
             max = arr[0];
            sum = 0;

            for(int j = 0; j < i; j++) {
                sum += arr[j];

                if(arr[j] > max) max = arr[j];
                if(arr[j] < min) min = arr[j];
            }
            float avg = sum /i;
            System.out.println("--- KẾT QUẢ ---");
            System.out.printf("Số học viên đã nhập: %d\n",i);
            System.out.printf("Điểm trung bình: %.2f\n",avg);
            System.out.printf("Điểm cao nhất: %.2f\n",max);

            System.out.printf("Điểm thấp nhất: %.2f\n",min);
            System.out.printf("Kết thúc chương trình.\n");
            break;



    }
}while (choice != 3);


    }
}