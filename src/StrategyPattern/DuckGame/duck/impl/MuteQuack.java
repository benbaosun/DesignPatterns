package StrategyPattern.DuckGame.duck.impl;

import StrategyPattern.DuckGame.behavior.QuackBehavior;

/**
 * Created by lkmc2 on 2018/6/25.
 * 不会叫（叫唤行为）
 */

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<不会叫>>");
    }
}
