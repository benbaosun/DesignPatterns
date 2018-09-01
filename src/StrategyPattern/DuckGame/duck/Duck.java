package StrategyPattern.DuckGame.duck;

import StrategyPattern.DuckGame.behavior.FlyBehavior;
import StrategyPattern.DuckGame.behavior.QuackBehavior;

/**
 * Created by lkmc2 on 2018/6/25.
 * 鸭子类（策略模式）
 */

public abstract class Duck {
    // 飞行行为
    protected FlyBehavior flyBehavior;

    // 叫唤行为
    protected QuackBehavior quackBehavior;

    // 游泳
    public void swim() {
        System.out.println("我会游泳");
    }

    // 外观
    public abstract void display();

    // 执行飞行行为
    public void performFly() {
        flyBehavior.fly();
    }

    // 执行叫唤行为
    public void performQuack() {
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
