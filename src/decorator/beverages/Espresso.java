package decorator.beverages;

import decorator.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
        cost = 1.99;
    }

    @Override
    public double cost() {
        return cost;
    }
}
