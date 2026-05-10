package strategy.test;


import strategy.behavior.fly.FlyRocketPowered;
import strategy.ducks.Duck;
import strategy.ducks.MallardDuck;
import strategy.ducks.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();


    }
}
