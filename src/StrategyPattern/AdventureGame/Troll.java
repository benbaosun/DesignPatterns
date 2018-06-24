package StrategyPattern.AdventureGame;

/**
 * Created by lkmc2 on 2018/6/25.
 * 巨人（角色）
 */

public class Troll extends Character {
    public Troll() {
        weaponBehavior = new KnifeBehavior(); // 使用匕首
    }
}
