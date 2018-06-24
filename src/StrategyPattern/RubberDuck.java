package StrategyPattern;

/**
 * Created by lkmc2 on 2018/6/25.
 * 橡皮鸭（吱吱叫、不会飞）
 */

public class RubberDuck extends Duck {
    @Override
    void quack() {
        System.out.println("我会吱吱叫");
    }

    @Override
    void display() {
        System.out.println("我是橡皮鸭");
    }

    @Override
    void fly() {
        // 什么也不做
    }
}
