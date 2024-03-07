package serviceImpl;

import model.OrderModel;
import service.OrderService;

import java.util.*;
import java.util.List;

public class OrderServiceImpl implements OrderService {

    private static OrderService instance = new OrderServiceImpl();
    OrderModel orderModel;

    private OrderServiceImpl() {
        this.orderModel = new OrderModel();
    }

    public static OrderService getInstance() {
        return instance;
    }

    @Override
    public String orederMenu(String menu) {
//        List<String> seperation = new ArrayList<>(Arrays.asList(Arrays.toString(menu.split(",|-"))));
        List<String> orderDish = new ArrayList<>();
        List<String> quantity = new ArrayList<>();
        String[] menulist = menu.split(",|-| ");
        for (int i = 0; i < menulist.length; i++) {
            if (i % 2 == 0) {
                orderDish.add(menulist[i]);
            } else {
                quantity.add(menulist[i]);
            }
        }

        orderModel.setMenu(orderDish);
        orderModel.setQuantity(quantity);

        List<?> dish = orderModel.getMenu();
        List<?> qty = orderModel.getQuantity();
        orderModel.getMenu().forEach(i-> System.out.println(i));

        for(int i =0; i<dish.size();i++){ㄴ
            System.out.printf(dish.get(i) + qty.get(i)+"개" );
        }
        return "주문완료";
    }

    @Override
    public String totalPrice() {
        return null;
    }

    @Override
    public String serviceMenu() {
        return null;
    }

    @Override
    public Map<String, ?> benefits() {
        return null;
    }

    @Override
    public String totlBenefit() {
        return null;
    }

    @Override
    public String benefitPrice() {
        return null;
    }

    @Override
    public String eventBadge() {
        return null;
    }
}
