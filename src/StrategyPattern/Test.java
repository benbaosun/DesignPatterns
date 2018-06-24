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
        duck.fly();
        /*
            运行结果：
            ----------红头鸭----------
            我会呱呱叫
            我会游泳
            我是红头鸭
            我会飞
         */

        printInfo("绿头鸭");
        duck = new GreenHeadDuck();
        duck.quack();
        duck.swim();
        duck.display();
        duck.fly();
        /*
            运行结果：
            ----------绿头鸭----------
            我会呱呱叫
            我会游泳
            我是绿头鸭
            我会飞
         */

        printInfo("橡皮鸭");
        duck = new RubberDuck();
        duck.quack();
        duck.swim();
        duck.display();
        duck.fly();
        /*
            运行结果：
            ----------橡皮鸭----------
            我会吱吱叫
            我会游泳
            我是橡皮鸭
         */

        printInfo("诱饵鸭");
        duck = new DecoyDuck();
        duck.quack();
        duck.swim();
        duck.display();
        duck.fly();
         /*
            运行结果：
            ----------诱饵鸭----------
            我会游泳
            我是诱饵鸭
         */
    }

    private static void printInfo(String info) {
        System.out.println("----------" + info + "----------");
    }
}
