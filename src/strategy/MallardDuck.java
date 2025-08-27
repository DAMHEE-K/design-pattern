package strategy;

import strategy.behavior.fly.FlyBehavior;
import strategy.behavior.fly.FlyWithWing;
import strategy.behavior.quack.Quack;
import strategy.behavior.quack.QuackBehavior;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWing();
    }

    @Override
    public void display() {}

}
