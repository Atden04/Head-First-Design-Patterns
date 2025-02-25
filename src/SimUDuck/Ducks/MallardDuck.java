package SimUDuck.Ducks;

import SimUDuck.FlyBehaviors.FlyWithWings;
import SimUDuck.QuackBehaviors.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
