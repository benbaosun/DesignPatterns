package StrategyPattern.DuckGame;

/**
 * Created by lkmc2 on 2018/6/25.
 * 鸭子类
 */

public abstract class Duck {
    // 飞行行为
    FlyBehavior flyBehavior;

    // 叫唤行为
    QuackBehavior quackBehavior;

    // 游泳
    void swim() {
        System.out.println("我会游泳");
    }

    // 外观
    public abstract void display();

    // 执行飞行行为
    void performFly() {
        flyBehavior.fly();
    }

    // 执行叫唤行为
    void performQuack() {
        quackBehavior.quack();
    }

    // 设置飞行行为
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    // 设置叫唤行为
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
