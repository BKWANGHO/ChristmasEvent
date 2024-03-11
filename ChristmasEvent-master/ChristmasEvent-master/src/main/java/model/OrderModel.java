package model;

import java.util.List;

public class OrderModel {

    int date;
    List<String> menu;
    List<String> quantity;

    @Override
    public String toString() {
        return "OrderModel{" +
                "date='" + date + '\'' +
                ", menu=" + menu +
                ", quantity=" + quantity +
                '}';
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }



    public List<String> getMenu() {
        return menu;
    }

    public void setMenu(List<String> menu) {
        this.menu = menu;
    }

    public List<String> getQuantity() {
        return quantity;
    }

    public void setQuantity(List<String> quantity) {
        this.quantity = quantity;
    }
}
