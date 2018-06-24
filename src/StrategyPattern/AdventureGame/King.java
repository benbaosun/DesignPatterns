package StrategyPattern.AdventureGame;

/**
 * Created by lkmc2 on 2018/6/25.
 * 国王（角色）
 */

public class King extends Character {
    public King() {
        weaponBehavior = new BowAndArrowBehavior(); // 使用弓箭
    }
}
