package decorator.beverages;

import decorator.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "HouseBlend";
        cost = 0.89;
    }

    @Override
    public double cost() {
        return cost;
    }
}
