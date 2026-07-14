package ref.ex;

import java.util.Scanner;

public class ProductMain2 {
    public static void main(String[] args) {

        ProductOrder productOrders[] = new ProductOrder[3];
        productOrders[0] = creeateOrder("두부", 2000, 2);
        productOrders[1] = creeateOrder("김치", 5000, 1);
        productOrders[2] = creeateOrder("콜라", 1500, 2);

        printOrders(productOrders);

        System.out.println("총 가격 : " + getTotalAmount(productOrders));
    }

    static ProductOrder creeateOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명 : " + order.productName + ", 가격 : " + order.price + ", 수량 : " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }
}
