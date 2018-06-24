package StrategyPattern;

/**
 * Created by lkmc2 on 2018/6/25.
 * 不会飞（飞行行为）
 */

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        // 什么也不做
    }
}
