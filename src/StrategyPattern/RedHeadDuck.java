package StrategyPattern;

/**
 * Created by lkmc2 on 2018/6/25.
 * 红头鸭
 */

public class RedHeadDuck extends Duck implements Flyable, Quackable {
    @Override
    void display() {
        System.out.println("我是红头鸭");
    }

    // 飞行
    @Override
    public void fly() {
        System.out.println("我会飞");
    }

    // 呱呱叫
    @Override
    public void quack() {
        System.out.println("我会呱呱叫");
    }
}
