package StrategyPattern.AdventureGame;

/**
 * Created by lkmc2 on 2018/6/25.
 * 王后（角色）
 */

public class Queen extends Character {
    public Queen() {
        weaponBehavior = new AxeBehavior(); // 使用斧头
    }
}
