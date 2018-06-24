package StrategyPattern;

/**
 * Created by lkmc2 on 2018/6/25.
 * 鸭子类
 */

public class Duck {
    // 呱呱叫
    void quack() {
        System.out.println("我会呱呱叫");
    }

    // 游泳
    void swim() {
        System.out.println("我会游泳");
    }

    // 外观
    void display() {
        System.out.println("我是鸭子");
    }

    // 飞行
    void fly() {
        System.out.println("我会飞");
    }
}
