package StrategyPattern;

/**
 * Created by lkmc2 on 2018/6/25.
 * 橡皮鸭（吱吱叫、不会飞）
 */

public class RubberDuck extends Duck {

    @Override
    void display() {
        System.out.println("我是橡皮鸭");
    }

}
