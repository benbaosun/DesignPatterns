package StrategyPattern.AdventureGame;

import StrategyPattern.AdventureGame.role.*;
import StrategyPattern.AdventureGame.role.Character;

/**
 * Created by lkmc2 on 2018/6/25.
 * 测试类
 */

public class Test {
    public static void main(String[] args) {
        printInfo("国王");
        Character role = new King();
        role.fight();

        printInfo("王后");
        role = new Queen();
        role.fight();

        printInfo("骑士");
        role = new Knight();
        role.fight();

        printInfo("巨人");
        role = new Troll();
        role.fight();

        /*
            运行结果：
            --------国王--------
            使用弓箭射击
            --------王后--------
            使用斧头劈砍
            --------骑士--------
            使用宝剑挥舞
            --------巨人--------
            使用匕首刺杀
         */
    }

    private static void printInfo(String info) {
        System.out.println("--------" + info + "--------");
    }
}
