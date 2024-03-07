package model;


import java.util.List;

public class OrderModel {

    String date;
    List<?> menu;
    List<?> quantity;

    @Override
    public String toString() {
        return "OrderModel{" +
                "date='" + date + '\'' +
                ", menu=" + menu +
                ", quantity=" + quantity +
                '}';
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }



    public List<?> getMenu() {
        return menu;
    }

    public void setMenu(List<?> menu) {
        this.menu = menu;
    }

    public List<?> getQuantity() {
        return quantity;
    }

    public void setQuantity(List<?> quantity) {
        this.quantity = quantity;
    }
}
