import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int row, col;
        int currentRow = 0;
        int currentCol = 0;

        System.out.print("Nhập số hàng: ");
        row = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập số cột: ");
        col = Integer.parseInt(sc.nextLine());

        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                System.out.printf("Nhập phần tử [%d][%d]: ", currentRow, currentCol);

                do {
                    try {
                        arr[currentRow][currentCol] = Integer.parseInt(sc.nextLine());
                        break;

                    } catch (NumberFormatException e) {
                        System.err.print("Phần tử phải là số nguyên! Nhập lại: ");
                    }

                } while (true);

                currentCol++;
            }
            currentRow++;
            currentCol = 0;
        }

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                if (arr[i][j] % 2 == 0) {
                    sumEven += arr[i][j];
                } else {
                    sumOdd += arr[i][j];
                }

            }
        }

        System.out.println("\nKết quả:");

        System.out.println("Tổng số chẵn: " + sumEven);
        System.out.println("Tổng số lẻ: " + sumOdd);

    }
}