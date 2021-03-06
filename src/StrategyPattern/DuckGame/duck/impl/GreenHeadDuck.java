package StrategyPattern.DuckGame.duck.impl;

import StrategyPattern.DuckGame.behavior.impl.FlyWithWings;
import StrategyPattern.DuckGame.behavior.impl.Quack;
import StrategyPattern.DuckGame.duck.Duck;

/**
 * Created by lkmc2 on 2018/6/25.
 * 绿头鸭
 */

public class GreenHeadDuck extends Duck {

    public GreenHeadDuck() {
        flyBehavior = new FlyWithWings(); // 使用翅膀飞行
        quackBehavior = new Quack(); // 呱呱叫
    }

    @Override
    public void display() {
        System.out.println("我是绿头鸭");
    }

}
