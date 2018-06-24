package StrategyPattern;

/**
 * Created by lkmc2 on 2018/6/25.
 * 鸭子类
 */

public class Duck {
    // 飞行行为
    FlyBehavior flyBehavior;

    // 叫唤行为
    QuackBehavior quackBehavior;

    // 游泳
    void swim() {
        System.out.println("我会游泳");
    }

    // 外观
    void display() {
        System.out.println("我是鸭子");
    }

    // 执行飞行行为
    void performFly() {
        flyBehavior.fly();
    }

    // 执行叫唤行为
    void performQuack() {
        quackBehavior.quack();
    }
}
