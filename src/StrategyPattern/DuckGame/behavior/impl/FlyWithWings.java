package StrategyPattern.DuckGame.behavior.impl;

import StrategyPattern.DuckGame.behavior.FlyBehavior;

/**
 * Created by lkmc2 on 2018/6/25.
 * 使用翅膀飞行（飞行行为）
 */

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我会飞");
    }
}
