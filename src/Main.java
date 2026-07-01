import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int elementCount;
        int currentIndex = 0;

        System.out.print("Nhập số phần tử của mảng: ");
        elementCount = Integer.parseInt(sc.nextLine());

        if (elementCount == 0) {
            System.out.println("Mảng không có phần tử");
            System.exit(0);
        }

        int[] arr = new int[elementCount];

        for (int i = 0; i < elementCount; i++) {
            System.out.printf("Nhập phần tử %d: ", currentIndex + 1);

            do {
                try {
                    arr[currentIndex] = Integer.parseInt(sc.nextLine());
                    currentIndex++;
                    break;

                } catch (NumberFormatException e) {
                    System.err.print("Phần tử phải là số nguyên! Nhập lại: ");
                }

            } while (true);
        }

        System.out.println("\nMảng ban đầu:");

        for (int i = 0; i < elementCount; i++) {
            System.out.print(arr[i] + " ");
        }

        int[] result = new int[elementCount];
        currentIndex = 0;

        // Đưa số chẵn vào trước
        for (int i = 0; i < elementCount; i++) {
            if (arr[i] % 2 == 0) {
                result[currentIndex] = arr[i];
                currentIndex++;
            }
        }

        // Đưa số lẻ vào sau
        for (int i = 0; i < elementCount; i++) {
            if (arr[i] % 2 != 0) {
                result[currentIndex] = arr[i];
                currentIndex++;
            }
        }

        System.out.println("\nMảng sau khi sắp xếp:");

        for (int i = 0; i < elementCount; i++) {
            System.out.print(result[i] + " ");
        }

    }
}