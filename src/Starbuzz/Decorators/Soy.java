package Starbuzz.Decorators;

import Starbuzz.Beverages.Beverage;
import Starbuzz.Enums.Size;

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
        if (this.beverage.getSize() == Size.TALL)
            return beverage.cost() + 0.1;
        else if (this.beverage.getSize() == Size.GRANDE)
            return beverage.cost() + 0.15;
        else
            return beverage.cost() + 0.2;
    }
}
