package service;

import model.MenuModel;
import model.OrderModel;

import java.util.List;

public interface OrderService {
    List<?> orderMenu(String menu);

    List<?> orderQuantity(String menu);

    int totalPrice();

    String serviceMenu();


    int totlBenefit(OrderModel orderDate);

    String benefitPrice();

    String eventBadge();

    int christmasBenefit(OrderModel orderDate);

    int weekdayDiscount(OrderModel orderDate);

    int weekEndDiscount(OrderModel orderDate);

    int specialDiscount(OrderModel orderDate);
}
