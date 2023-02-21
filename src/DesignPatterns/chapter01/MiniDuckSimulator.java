package DesignPatterns.chapter01;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        System.out.println("-----------------------------");

        Duck model = new ModelDuck();
        model.performFly();
        System.out.println("<실행 중에 오리의 행동을 바꾸고싶다면,원하는 행동에 해당하는 Duck의 setter메소드 호출>");
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}

class ModelDuck extends Duck{
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("저는 모형 오리입니다");
    }

}
class MallardDuck extends Duck{
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("저는 물오리입니다");
    }

}
