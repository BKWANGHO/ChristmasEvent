package view;

import camp.nextstep.edu.missionutils.Console;
import controller.OrderController;

import java.util.Scanner;

public class OrderView {
    public static void main(Scanner sc) {

        OrderController controller = new OrderController();


        System.out.println("안녕하세요! 우테코 식당 12월 이벤트 플래너 입니다. ");
        System.out.println("12월 중 식당 예상 방문 날짜는 언제인가요?(숫자만 입력해주세요!)");

        String date = Console.readLine();
        controller.inputDate(date);

        System.out.println("주문하실 메뉴를 메뉴와 개수를 알려 주세요. (e.g. 해산물파스타-2,레드와인-1,초코케이크-1)");
        String order = sc.next();

        System.out.println("12월 "+ date + "일에 우테코 식당에서 받을 이벤트 혜택 미리보기!");
        System.out.println("<주문메뉴>");
       controller.orderMenu(order);
        System.out.println("<할인 전 총주문 금액>");

        System.out.println("<증정메뉴>");

        System.out.println("<혜택내역>");

        System.out.println("<총 혜택금액>");

        System.out.println("<할인 후 예상 결제금액>");

        System.out.println("<12월 이벤트 뱃지 >");

    }
}

