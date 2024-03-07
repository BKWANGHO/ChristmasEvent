package model;

import java.util.HashMap;
import java.util.Map;

public class MenuModel {
    @Override
    public String toString() {
        return "MenuModel{" +
                "appetizer=" + appetizer +
                ", mainDish=" + mainDish +
                ", dessert=" + dessert +
                ", beverage=" + beverage +
                '}';
    }

    Map<String,Integer> appetizer;
Map<String,Integer> mainDish;
Map<String,Integer> dessert;
Map<String,Integer> beverage;

MenuModel() {
    appetizer = new HashMap<>();
    mainDish = new HashMap<>();
    dessert = new HashMap<>();
    beverage = new HashMap<>();
    appetizerInitialize();
    mainDishInitialize();
    dessertInitialize();
    beverageInitialize();
}

private void appetizerInitialize()  {
    appetizer.put("양송이 스프", 6000);
    appetizer.put("타파스", 5500);
    appetizer.put("시저샐러드", 8000);
}
private void mainDishInitialize(){
    mainDish.put("티본스테이크",55000);
    mainDish.put("바베큐립",54000);
    mainDish.put("해산물파스타",35000);
    mainDish.put("크리스마스파스타",25000);
}
    private void dessertInitialize(){
        dessert.put("초코케이크",15000);
        dessert.put("아이스크림",5000);
    }
    private void beverageInitialize(){
        beverage.put("제로콜라",3000);
        beverage.put("레드와인",60000);
        beverage.put("샴페인",25000);
    }


}
