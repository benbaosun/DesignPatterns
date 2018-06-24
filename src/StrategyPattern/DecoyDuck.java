package StrategyPattern;

/**
 * Created by lkmc2 on 2018/6/25.
 * 诱饵鸭（不会飞、不会叫）
 */

public class DecoyDuck extends Duck {
    @Override
    void quack() {
        // 什么也不做
    }

    @Override
    void display() {
        System.out.println("我是诱饵鸭");
    }

    @Override
    void fly() {
        // 什么也不做
    }
}
