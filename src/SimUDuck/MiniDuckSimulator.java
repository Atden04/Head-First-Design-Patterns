package SimUDuck;

import SimUDuck.Ducks.Duck;
import SimUDuck.Ducks.MallardDuck;
import SimUDuck.Ducks.ModelDuck;
import SimUDuck.FlyBehaviors.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main (String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
