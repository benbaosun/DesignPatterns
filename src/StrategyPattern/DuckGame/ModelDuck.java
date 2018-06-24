package StrategyPattern.DuckGame;

/**
 * Created by lkmc2 on 2018/6/25.
 * 模型鸭（一开始不会飞，可通过设置飞行行为获得飞行功能）
 */

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay(); // 不会飞
    }

    @Override
    public void display() {
        System.out.println("我是模型鸭");
    }
}
