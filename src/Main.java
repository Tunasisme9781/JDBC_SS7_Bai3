import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        int currentIndex = 0;

        System.out.print("Nhập số phần tử của mảng: ");
        n = Integer.parseInt(sc.nextLine());

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {

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

        // Bubble Sort giảm dần
        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }

        }

        System.out.println("\nMảng sau khi sắp xếp giảm dần:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}