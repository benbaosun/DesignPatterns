package StrategyPattern.AdventureGame;

/**
 * Created by lkmc2 on 2018/6/25.
 * 使用斧头（武器行为）
 */

public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("使用斧头劈砍");
    }
}
