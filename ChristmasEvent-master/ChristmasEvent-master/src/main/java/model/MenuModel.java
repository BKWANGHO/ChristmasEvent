package model;

import lombok.Getter;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;
@Getter
@ToString
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

    public Map<String, Integer> getAppetizer() {
        return appetizer;
    }

    public Map<String, Integer> getMainDish() {
        return mainDish;
    }

    public Map<String, Integer> getDessert() {
        return dessert;
    }

    public Map<String, Integer> getBeverage() {
        return beverage;
    }

    Map<String, Integer> appetizer;
    Map<String, Integer> mainDish;
    Map<String, Integer> dessert;
    Map<String, Integer> beverage;

    public MenuModel() {
        appetizer = new HashMap<>();
        mainDish = new HashMap<>();
        dessert = new HashMap<>();
        beverage = new HashMap<>();
        appetizerInitialize();
        mainDishInitialize();
        dessertInitialize();
        beverageInitialize();
    }

    private void appetizerInitialize() {
        appetizer.put("시저샐러드", 8000);
        appetizer.put("양송이 스프", 6000);
        appetizer.put("타파스", 5500);
        appetizer.put("티본스테이크", 55000);
        appetizer.put("바베큐립", 54000);
        appetizer.put("해산물파스타", 35000);
        appetizer.put("크리스마스파스타", 25000);
        appetizer.put("초코케이크", 15000);
        appetizer.put("아이스크림", 5000);
        appetizer.put("제로콜라", 3000);
        appetizer.put("레드와인", 60000);
        appetizer.put("샴페인", 25000);
    }

    private void mainDishInitialize() {

    }

    private void dessertInitialize() {

    }

    private void beverageInitialize() {

    }


}
