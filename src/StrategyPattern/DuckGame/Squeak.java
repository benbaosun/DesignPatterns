package StrategyPattern.DuckGame;

/**
 * Created by lkmc2 on 2018/6/25.
 * 吱吱叫（叫唤行为）
 */

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("我会吱吱叫");
    }
}
