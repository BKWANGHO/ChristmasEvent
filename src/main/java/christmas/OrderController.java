package christmas;

import java.util.Scanner;

public class OrderController {
    OrderService orderService;
    OrderView orderView;
    public OrderController() {
        this.orderService = OrderServiceImpl.getInstance();
        this.orderView = OrderView.getInstance();
    }




    public void startApp(Scanner sc){
    orderView.printHello();
    orderView.inputMenu(sc);
    orderView.printBenefitPreview(orderView.inputDate());
    }

    public  String orederMenu(Scanner sc){
        String menu = orderView.inputMenu(sc);
        orderService.orederMenu(menu);
        return null;
    }

}
