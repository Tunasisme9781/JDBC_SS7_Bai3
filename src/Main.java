import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int elementCount;
        int currentIndex = 0;

        System.out.print("Nhập số phần tử của mảng: ");
        elementCount = Integer.parseInt(sc.nextLine());

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

        // Selection Sort giảm dần
        for (int i = 0; i < elementCount - 1; i++) {

            int maxIndex = i;

            for (int j = i + 1; j < elementCount; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }

        System.out.println("\nMảng sau khi sắp xếp giảm dần:");

        for (int i = 0; i < elementCount; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        int number;

        System.out.print("\nNhập số cần tìm: ");
        number = Integer.parseInt(sc.nextLine());

        // Linear Search
        boolean found = false;

        for (int i = 0; i < elementCount; i++) {
            if (arr[i] == number) {
                System.out.println("Linear Search: Tìm thấy tại vị trí " + (i + 1));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Linear Search: Không tìm thấy!");
        }

        // Binary Search trên mảng giảm dần
        int left = 0;
        int right = elementCount - 1;
        found = false;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (arr[mid] == number) {
                System.out.println("Binary Search: Tìm thấy tại vị trí " + (mid + 1));
                found = true;
                break;
            }

            if (number > arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (!found) {
            System.out.println("Binary Search: Không tìm thấy!");
        }

    }
}