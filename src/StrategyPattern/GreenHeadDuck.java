package StrategyPattern;

/**
 * Created by lkmc2 on 2018/6/25.
 * 绿头鸭
 */

public class GreenHeadDuck extends Duck implements Flyable, Quackable {
    @Override
    void display() {
        System.out.println("我是绿头鸭");
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
