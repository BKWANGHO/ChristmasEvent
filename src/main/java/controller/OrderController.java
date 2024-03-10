package controller;

import model.OrderModel;
import service.OrderService;
import serviceImpl.OrderServiceImpl;

import java.util.List;

public class OrderController {
    OrderService orderService;
    OrderModel orderModel;
    public OrderController() {
        this.orderService = OrderServiceImpl.getInstance();
        this.orderModel = new OrderModel();
    }
    public String inputDate(String date) {
        orderModel.setDate(date);
        return "날짜입력 완료";
    }
    public List<?> orderMenu(String order) {
        return orderService.orderMenu(order);
    }
    public List<?> orderQuantity(String order){
        return orderService.orderQuantity(order);
    }

    public int totalPrice() {
        return orderService.totalPrice();
    }

    public String serviceMenu() {
        return orderService.serviceMenu();
    }

    public int christmasBenefit(String date) {
        orderModel.setDate(date);
        return orderService.christmasBenefit(orderModel);
    }

    public int weekdayDiscount(String date) {
        orderModel.setDate(date);
        return orderService.weekdayDiscount(orderModel);
    }

    public int weekEndDiscount(String date) {
        orderModel.setDate(date);
        return orderService.weekEndDiscount(orderModel);
    }

    public int SpecialDiscount(String date) {
        orderModel.setDate(date);
        return orderService.specialDiscount(orderModel);
    }

    public int totlBenefit(String date) {
        orderModel.setDate(date);
        return orderService.totlBenefit(orderModel);
    }
}
