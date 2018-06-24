package StrategyPattern;

/**
 * Created by lkmc2 on 2018/6/25.
 * 测试类
 */

public class Test {
    public static void main(String[] args) {
        Duck duck = new RedHeadDuck();
        printInfo("红头鸭");
        duck.quack();
        duck.swim();
        duck.display();
        /*
            运行结果：
            ----------红头鸭----------
            我会呱呱叫
            我会游泳
            我是红头鸭
         */

        printInfo("绿头鸭");
        duck = new GreenHeadDuck();
        duck.quack();
        duck.swim();
        duck.display();
        /*
            运行结果：
            ----------绿头鸭----------
            我会呱呱叫
            我会游泳
            我是绿头鸭
         */
    }

    private static void printInfo(String info) {
        System.out.println("----------" + info + "----------");
    }
}
