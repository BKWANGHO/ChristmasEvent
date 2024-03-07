package christmas;

import controller.OrderController;
import model.OrderModel;
import view.OrderView;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OrderView view = new OrderView();
        OrderView.main(sc);
    }
}
