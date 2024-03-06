package christmas;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderView {
    private static OrderView instance = new OrderView();

    private OrderView() {
    }
    public static OrderView getInstance() {
        return instance;
    }



    public void printHello(){
        System.out.println("안녕하세요! 우테코 식당 12월 이벤트 플래너 입니다. ");
        System.out.println("12월 중 식당 예상 방문 날짜는 언제인가요?(숫자만 입력해주세요!)");
    }
    public String inputDate(){
    return Console.readLine();
    }
    public String inputMenu(Scanner sc){
        System.out.println("주문하실 메뉴를 메뉴와 개수를 알려 주세요. (e.g. 해산물파스타-2,레드와인-1,초코케이크-1)");
        return sc.next();
    }
    public void printBenefitPreview(String date){
        System.out.println("12월 " + date +"일에 우테코 식당에서 받을 이벤트 혜택 미리보기!");
    }

}
