package christmas;

import java.awt.*;
import java.util.*;
import java.util.List;

public class OrderServiceImpl implements OrderService{

    OrderModel orderModel;
    private static OrderService instance = new OrderServiceImpl();

    private OrderServiceImpl() {
this.orderModel = new OrderModel();
    }
    public static OrderService getInstance() {
        return instance;
    }

    @Override
    public String orederMenu(String menu) {
        List<String> seperation = new ArrayList<>();

        for(int i=0; i<seperation.size();i++) {
            seperation.set(i, Arrays.toString(menu.split(",|-")));
        if (i/2==0){
            orderModel.menu.set(i,seperation.get(i));
        }
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
