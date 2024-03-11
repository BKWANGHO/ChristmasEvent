package view;

import camp.nextstep.edu.missionutils.Console;
import controller.OrderController;

import java.text.DecimalFormat;
import java.util.Scanner;

public class OrderView {
    public static void main(Scanner sc) {
        DecimalFormat decimalFormat = new DecimalFormat("###,###");
        OrderController controller = new OrderController();

        while (true) {
            System.out.println("\n안녕하세요! 우테코 식당 12월 이벤트 플래너 입니다. ");
            System.out.println("12월 중 식당 예상 방문 날짜는 언제인가요?(숫자만 입력해주세요!)");

            int date = Integer.parseInt(Console.readLine());
            controller.inputDate(date);

            System.out.println("주문하실 메뉴를 메뉴와 개수를 알려 주세요. (e.g. 해산물파스타-2,레드와인-1,초코케이크-1)");
            String order = sc.next();

            System.out.println("12월 " + date + "일에 우테코 식당에서 받을 이벤트 혜택 미리보기!\n");
            System.out.println("<주문메뉴>");
            for (int i = 0; i < controller.orderMenu(order).size(); i++) {
                System.out.println((controller.orderMenu(order).get(i))
                        + " "
                        + (controller.orderQuantity(order).get(i)) + "개");
            }
            System.out.println("\n<할인 전 총주문 금액>");
            System.out.println(decimalFormat.format(controller.totalPrice()) + "원\n");
            System.out.println("<증정메뉴>");
            System.out.println(controller.serviceMenu()+"\n");
            System.out.println("<혜택내역>");
            System.out.println("크리스마스 디데이 할인 : -"+decimalFormat.format(controller.christmasBenefit(date)) + "원");
            System.out.println("평일 할인 : -" + decimalFormat.format(controller.weekdayDiscount(date))+"원");
            System.out.println("주말 할인 : -" + decimalFormat.format(controller.weekEndDiscount(date)));
            System.out.println("특별 할인 : -" + decimalFormat.format(controller.SpecialDiscount(date))+"\n");

            System.out.println("<총 혜택금액>");
            System.out.println(decimalFormat.format(controller.totlBenefit(date)) + "원\n");

            System.out.println("<할인 후 예상 결제금액>");

            System.out.println("\n<12월 이벤트 뱃지 >");
        }
    }
}

