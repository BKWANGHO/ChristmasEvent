package controller;

import model.OrderModel;
import service.OrderService;
import serviceImpl.OrderServiceImpl;

import java.util.List;
import java.util.Scanner;

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


    public String orderMenu(String order) {
        return orderService.orederMenu(order);
    }
}
