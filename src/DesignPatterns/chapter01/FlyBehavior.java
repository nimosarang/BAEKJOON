package DesignPatterns.chapter01;

public interface FlyBehavior {
    public void fly();
}

class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("날고 있어요!");
    }
}

class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("저는 날지 못해요");
    }
}

class FlyRocketPowered implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("로켓 추진으로 날아갑니다");
    }
}


