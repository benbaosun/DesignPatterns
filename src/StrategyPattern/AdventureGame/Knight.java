package StrategyPattern.AdventureGame;

/**
 * Created by lkmc2 on 2018/6/25.
 * 骑士（角色）
 */

public class Knight extends Character {
    public Knight() {
        weaponBehavior = new SwordBehavior(); // 使用宝剑
    }
}
