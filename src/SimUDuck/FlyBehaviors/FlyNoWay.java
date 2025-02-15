package SimUDuck.FlyBehaviors;

import SimUDuck.Interfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly");
    }
}
