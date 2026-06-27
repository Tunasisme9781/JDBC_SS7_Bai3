import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new  Scanner(System.in);
        System.out.println("=============== NHẬP THÔNG TIN HÓA ĐƠN ===============");
        System.out.print("Tên khách hàng: ");
        String nameCustomer = sc.nextLine();

        System.out.print("Tên sản phẩm: ");
        String nameProduct = sc.nextLine();

        System.out.print("Giá sản phẩm: ");
        double priceProduct = Double.parseDouble(sc.nextLine());

        System.out.print("Số lượng mua: ");
        int quantity = Integer.parseInt(sc.nextLine());

        System.out.print("Thẻ thành viên? (true/false): ");
        boolean cardCustomer = sc.nextBoolean();

        double totalPrice = priceProduct * quantity;
        double priceSale =1;
        if(cardCustomer == true)  priceSale  = totalPrice * 0.1;
        else priceSale = 0;

        double vat = totalPrice * 0.08;

        double totalPayment = totalPrice - priceSale + vat;

        System.out.printf("Khách hàng: %s\n",nameCustomer);
        System.out.printf("Sản phẩm: %s\n",nameProduct);
        System.out.printf("Giá: %.2f VNĐ\n",priceProduct);
        System.out.printf("Số lượng: %d\n",quantity);
        System.out.printf("Thành tiền: %.2f VNĐ\n",totalPrice);
        System.out.printf("Giảm giá: %.2f VNĐ\n",priceSale);
        System.out.printf("Tiền VAT: %.2f VNĐ\n",vat);
        System.out.printf("Tổng tiền thanh toán: %.2f VNĐ",totalPayment);



    }
}