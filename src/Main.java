
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String choice = "1";
//
        while (choice.equals("1")) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập vào số N: ");
            int n = Integer.parseInt(sc.nextLine());
            if (n<0) n=n*-1;
            int soDu,soChia,tong = 0;
            do {

                soDu = n%10;
                soChia = n/10;
                tong = tong +soDu;
                n=n/10;


            }while(soChia > 0);
            System.out.printf("Tổng các chữ số là: %d",tong);





            System.out.println("\nBạn có muốn nhập lại không? ");
            System.out.println("nếu có ấn phím 1, nếu không ấn bất kì để thoát! ");
            choice = sc.nextLine();
        }
    }


}
