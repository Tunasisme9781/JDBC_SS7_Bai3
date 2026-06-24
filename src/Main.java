
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String choice = "1";
//
        while (choice.equals("1")) {
            System.out.println("\nNhập vào 3 cạnh của tam giác\n");
            int canh1,canh2,canh3;
            System.out.println("Cạnh thứ nhất: ");
            Scanner sc = new Scanner(System.in);
            canh1 = Integer.parseInt(sc.nextLine());
            System.out.println("Cạnh thứ hai: ");
            canh2 = Integer.parseInt(sc.nextLine());
            System.out.println("Cạnh thứ ba: ");
            canh3 = Integer.parseInt(sc.nextLine());
            int a = canh1*canh1 + canh2*canh2;
            int b = canh1*canh1 + canh3*canh3;
            int c = canh3*canh3 + canh2*canh2;

            if(canh1 <=0 || canh2 <=0 ||canh3 <=0)
            {

                System.out.println("Cạnh không được nhỏ hơn hoặc bằng 0");

            }
            else if (canh1+canh2<= canh3 || canh2+canh3<=canh1 || canh1+canh3 <= canh2) {
                System.out.println("Không phải 3 cạnh của 1 tam giác");

            }
            else if(canh1 == canh2 && canh3 == canh1)
            {
                System.out.println("Đây là 3 cạnh của tam giác đều");

            }

             else if(canh1 == canh2 || canh3 == canh1 || canh3 == canh2)
            {
                System.out.println("Đây là 3 cạnh của tam giác cân\n");

            }
            else if(a == canh3*canh3 || b == canh2*canh2 || c == canh1*canh1)
            {
                System.out.println("Đây là 3 cạnh của tam giác vuông");

            }
            else System.out.println("Đây là tam giác thường");
            System.out.println("\nBạn có muốn nhập lại không? ");
            System.out.println("nếu có ấn phím 1, nếu không ấn bất kì để thoát! ");
            choice = sc.nextLine();
        }
    }


}
