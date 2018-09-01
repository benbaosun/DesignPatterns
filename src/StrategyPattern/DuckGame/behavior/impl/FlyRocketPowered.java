package StrategyPattern.DuckGame.behavior.impl;

import StrategyPattern.DuckGame.behavior.FlyBehavior;

/**
 * Created by lkmc2 on 2018/6/25.
 * 火箭推进（飞行行为）
 */

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("使用火箭推进飞行");
    }
}
