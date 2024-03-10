package model;


import java.util.List;

public class OrderModel {

    String date;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
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
