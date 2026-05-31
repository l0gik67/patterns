package decorator;

public abstract class Beverage {

    protected String description = "Unknown Beverage";
    protected double cost = 0.0;

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
