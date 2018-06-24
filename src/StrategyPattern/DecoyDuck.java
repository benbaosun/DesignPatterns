package StrategyPattern;

/**
 * Created by lkmc2 on 2018/6/25.
 * 诱饵鸭（不会飞、不会叫）
 */

public class DecoyDuck extends Duck {

    @Override
    public void display() {
        System.out.println("我是诱饵鸭");
    }

}
