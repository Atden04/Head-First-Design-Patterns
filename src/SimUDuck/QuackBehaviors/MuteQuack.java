package SimUDuck.QuackBehaviors;

import SimUDuck.Interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
