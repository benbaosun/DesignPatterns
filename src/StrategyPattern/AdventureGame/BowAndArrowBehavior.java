package StrategyPattern.AdventureGame;

/**
 * Created by lkmc2 on 2018/6/25.
 * 使用弓箭（武器行为）
 */

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("使用弓箭射击");
    }
}
