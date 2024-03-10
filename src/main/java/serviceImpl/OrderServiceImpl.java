package serviceImpl;

import model.MenuModel;
import model.OrderModel;
import service.OrderService;

import java.util.*;
import java.util.List;

public class OrderServiceImpl implements OrderService {

    private static OrderService instance = new OrderServiceImpl();
    OrderModel orderModel;
    MenuModel menuModel;


    private OrderServiceImpl() {
        this.menuModel = new MenuModel();
        this.orderModel = new OrderModel();
    }

    public static OrderService getInstance() {
        return instance;
    }

    @Override
    public List<?> orderMenu(String menu) {
        List<String> orderDish = new ArrayList<>();
        String[] menulist = menu.split(",|-| ");
        for (int i = 0; i < menulist.length; i=i+2) {
                orderDish.add(menulist[i]);
        }
        orderModel.setMenu(orderDish);
        return orderModel.getMenu();
    }

    @Override
    public List<?> orderQuantity(String menu) {
        List<String> quantity = new ArrayList<>();
        String[] menulist = menu.split(",|-| ");
        for (int i = 1; i < menulist.length; i=i+2) {
            quantity.add(menulist[i]);
        }
        orderModel.setQuantity(quantity);
        return orderModel.getQuantity();
    }

    @Override
    public int totalPrice() {
        int total=0;
        for (int i =0; i<orderModel.getMenu().size();i++){
           total += Integer.parseInt(orderModel.getQuantity().get(i)) * menuModel.getAppetizer().get(orderModel.getMenu().get(i));
//           int main = Integer.parseInt(orderModel.getQuantity().get(i)) * menuModel.getMainDish().get(orderModel.getMenu().get(i));
//           int dst = Integer.parseInt(orderModel.getQuantity().get(i)) * menuModel.getDessert().get(orderModel.getMenu().get(i));
//           int bvr = Integer.parseInt(orderModel.getQuantity().get(i)) * menuModel.getBeverage().get(orderModel.getMenu().get(i));
//        total = api +main +dst +bvr;
        }
        return total;
    }

    @Override
    public String serviceMenu() {
        if(totalPrice()>120000){
            return "샴페인 1개";
        }
        return "없음";
    }


    @Override
    public String benefitPrice() {
        return null;
    }

    @Override
    public String eventBadge() {
        return null;
    }

    @Override
    public int christmasBenefit(OrderModel orderDate) {
        int date = Integer.parseInt(orderDate.getDate());
        int benefit = 0;
        if(0 < date && date <26 ){
            int christmas = 900;
            for (int i =0; i<date;i++){
                christmas +=100;
                benefit = christmas;
            }
        }
        return benefit;
    }

    @Override
    public int weekdayDiscount(OrderModel orderDate) {
        int benefit =0;
//        if (Integer.parseInt(orderModel.getDate()) % 7 != 1 && Integer.parseInt(orderModel.getDate()) % 7 != 2){
//            디저트 개당 -2023원 할인
//        }
        return benefit;
    }

    @Override
    public int weekEndDiscount(OrderModel orderDate) {
        int benefit=0;
//        if (Integer.parseInt(orderModel.getDate()) % 7 == 1 && Integer.parseInt(orderModel.getDate()) % 7 == 2){
//            메인 개당 -2023원 할인
//        }
        return benefit;
    }

    @Override
    public int specialDiscount(OrderModel orderDate) {
        if (Integer.parseInt(orderDate.getDate()) % 7 == 3 || Integer.parseInt(orderDate.getDate()) == 25){
           return 1000;
        }
        return 0;
    }
    @Override
    public int totlBenefit(OrderModel orderDate) {
                int benefit = christmasBenefit(orderDate) + weekdayDiscount(orderDate)+weekEndDiscount(orderDate)+ specialDiscount(orderDate);
                if(serviceMenu().equals("샴페인 1개")){
                    benefit += 25000;
                }
        return benefit;
    }

}
