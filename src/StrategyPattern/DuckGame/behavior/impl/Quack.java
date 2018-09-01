package StrategyPattern.DuckGame.behavior.impl;

import StrategyPattern.DuckGame.behavior.QuackBehavior;

/**
 * Created by lkmc2 on 2018/6/25.
 * 呱呱叫（叫唤行为）
 */

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("我会呱呱叫");
    }
}
