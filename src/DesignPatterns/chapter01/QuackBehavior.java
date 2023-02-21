package DesignPatterns.chapter01;

public interface QuackBehavior {
    public void quack();
}

class Quack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("꽥!");
    }
}

class Squeak implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("삑삑");
    }
}

class MuteQuack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("<<조용..>>");
    }
}
