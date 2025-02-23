package Starbuzz.Decorators;

import Starbuzz.Beverages.Beverage;
import Starbuzz.Enums.Size;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    public abstract String getDescription();
    
    public Size getSize() {
        return this.beverage.getSize();
    }
}
