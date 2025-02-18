package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {

        ProductOrder[] products = new ProductOrder[2];
        ProductOrder order1 = new ProductOrder();
        order1.productName = "정찬우";
        order1.price = 10000;
        order1.quantity = 5;
        products[0] = order1;

        ProductOrder order2 = new ProductOrder();
        order2.productName = "박한경";
        order2.price = 100000;
        order2.quantity = 5;
        products[1] = order2;

    int totalAmount = 0;
        for (ProductOrder product : products) {
            System.out.println("이름:" + product.productName + " 가격 : " + product.price + " 갯수 : " + product.quantity);
            totalAmount += product.price * product.quantity;

        }
        System.out.println("총 결제 금액 : " + totalAmount);


//        System.out.println("이름 : " + order1.productName + "가격 : " + order1.price + "갯수 : " + order1.quantity);
//        System.out.println("이름 : " + order2.productName + "가격 : " + order2.price + "갯수 : " + order2.quantity);




    }
}
