package strategy;

import strategy.behavior.fly.FlyBehavior;
import strategy.behavior.quack.QuackBehavior;

public abstract class Duck {
    // 변경 사항이 잦은 부분을 Duck 클래스에서 직접 구현하지 않고
    // 별도의 클래스 집합으로 분리시키고, 묶는다
    // Duck 클래스에서 행동을 구체적으로 구현할 필요가 없음
    // 행동을 상속 받는게 아니라, 행동 객체로 구성되어 행동을 부여 받는다
    // A에는 B가 있다 구성(composition) 관계 -> 상속보다는 구성을 활용한다!
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    
    public Duck() {}
    public abstract void display();
    
    // 행동 클래스에 위임
    public void performFly() {
        flyBehavior.fly();
    }
    public void performQuack() {
        quackBehavior.quack();
    }
    
    // 모든 Duck이 공통으로 가지는 행위 (변동 사항이 없는 부분들)
    public void swim() {
        System.out.println("swim");
    }

    // 행동을 동적으로 할당 가능하게 setter 구현
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

}
