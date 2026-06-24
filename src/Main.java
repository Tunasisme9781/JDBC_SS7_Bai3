
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String choice = "1";
//
        while (choice.equals("1")) {
            System.out.println("Nhập vào số từ 100 đến 999");
            int n;

            Scanner sc = new Scanner(System.in);
            n = Integer.parseInt(sc.nextLine());

            while (n < 100 || n>999) {
                System.out.println("Số nhập vào không hợp lệ!\n");
                System.out.println("Nhập lại N: ");
                n = Integer.parseInt(sc.nextLine());
            }
            int hundreds,tens,units;
            String textHundreds = "",textTens="",textUnits="";
            units = n%10;
            n=n/10;
            tens = n%10;
            n = n/10;
            hundreds = n%10;
//            System.out.printf("%d %d %d \n",hundreds,tens,units);

            switch (hundreds) {
                case 1:
                    textHundreds = "một trăm";
                    break;
                case 2:
                    textHundreds ="hai trăm";
                    break;
                case 3:
                    textHundreds ="ba trăm";
                    break;
                case 4:
                    textHundreds ="bốn trăm";break;
                case 5:
                    textHundreds ="năm trăm";break;
                case 6:
                    textHundreds ="sáu trăm";break;
                case 7:
                    textHundreds ="bảy trăm";break;
                case 8:
                    textHundreds ="tám trăm";break;
                case 9:
                    textHundreds ="chín trăm";


            }

            switch (tens) {
                case 1:
                    textTens = " mười";break;
                case 2:
                    textTens = " hai mươi";break;
                case 3:
                    textTens = " ba mươi";break;
                case 4:
                    textTens = " bốn mươi";break;
                case 5:

                    textTens = " năm mươi";break;
                case 6:
                    textTens = " sáu mươi";break;
                case 7:
                    textTens = " bảy mươi";break;
                case 8:
                    textTens = " tám mươi";break;
                case 9:
                    textTens = " chín mươi";break;
                case 0:
                    textTens = " lẻ";
                   break;

            }

            switch (units) {
                case 1:
                   textUnits = " một";break;
                case 2:
                    textUnits = " hai";break;
                case 3:
                    textUnits = " ba";break;
                case 4:
                    textUnits = " bốn";break;
                case 5:
                    if(tens!=0)
                        textUnits = " lăm";
                    else
                    textUnits = " năm";break;
                case 6:
                    textUnits = " sáu";break;
                case 7:
                    textUnits = " bảy";break;
                case 8:
                    textUnits = " tám";break;
                case 9:
                    textUnits = " chín";break;
                case 0:
                    textUnits = " ";break;

            }
            if(units == 0 && tens == 0) System.out.println(textHundreds);
            else
            System.out.println(textHundreds+ textTens+ textUnits);
            System.out.println("\nBạn có muốn nhập lại không? ");
            System.out.println("nếu có ấn phím 1, nếu không ấn bất kì để thoát! ");
            choice = sc.nextLine();
        }
    }


}
