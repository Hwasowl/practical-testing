package sample.cafekiosk.unit.beverage;

import sample.cafekiosk.unit.beverage.Beverage;

public class Latte implements Beverage {
    @Override
    public String getName() {
        return "라떼";
    }

    @Override
    public int price() {
        return 4500;
    }
}
