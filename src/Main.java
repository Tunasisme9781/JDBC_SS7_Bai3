
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String choice = "1";
//
        while (choice.equals("1")) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập vào số N: ");
            int n = Integer.parseInt(sc.nextLine());
            int tong =0;
        if(n<=0) System.out.println("Số nhập vào không hợp lệ!");
        else
        {
            for(int i=1;i<=n;i++)
            {
                tong = tong+i;
            } System.out.printf("Tổng các chữ số từ 1 đến %d là: %d",n, tong);
        }





            System.out.println("\nBạn có muốn nhập lại không? ");
            System.out.println("nếu có ấn phím 1, nếu không ấn bất kì để thoát! ");
            choice = sc.nextLine();
        }
    }


}
