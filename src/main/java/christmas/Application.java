package christmas;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    OrderController controller = new OrderController();

    controller.startApp(sc);
    }
}
