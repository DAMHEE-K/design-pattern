package strategy;

import strategy.behavior.fly.FlyRocketPowered;

/**
 * 전략 패턴(strategy pattern)
 * 알고리즘군을 정의하고 캡슐화해서 각각의 알고리즘군을 수정해서 쓸 수 있게 한다.
 * 전략 패턴을 사용하면 클라이언트로부터 알고리즘을 분리해서 독립적으로 변경할 수 있다.
 */
public class MiniDuckSimulator {
    public void simulator() {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered()); // 실행중에 오리의 행동을 바꾸고 싶을 때, setter 호출
        model.performFly();
    }

}
