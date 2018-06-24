package StrategyPattern.DuckGame;

/**
 * Created by lkmc2 on 2018/6/25.
 * 测试类
 */

public class Test {
    public static void main(String[] args) {
        Duck duck = new RedHeadDuck();
        printInfo("红头鸭");
        duck.swim();
        duck.display();
        duck.performFly();
        duck.performQuack();
        /*
            运行结果：
            ----------红头鸭----------
            我会游泳
            我是红头鸭
            我会飞
            我会呱呱叫
         */

        printInfo("绿头鸭");
        duck = new GreenHeadDuck();
        duck.swim();
        duck.display();
        duck.performFly();
        duck.performQuack();
        /*
            运行结果：
            ----------绿头鸭----------
            我会游泳
            我是绿头鸭
            我会飞
            我会呱呱叫
         */

        printInfo("橡皮鸭");
        duck = new RubberDuck();
        duck.swim();
        duck.display();
        duck.performQuack();
        /*
            运行结果：
            ----------橡皮鸭----------
            我会吱吱叫
            我会游泳
            我是橡皮鸭
            我会吱吱叫
         */

        printInfo("诱饵鸭");
        duck = new DecoyDuck();
        duck.swim();
        duck.display();
         /*
            运行结果：
            ----------诱饵鸭----------
            我会游泳
            我是诱饵鸭
         */

        printInfo("模型鸭");
        duck = new ModelDuck();
        duck.performFly();
        duck.setFlyBehavior(new FlyRocketPowered());
        duck.performFly();
        /*
            运行结果：
            ----------模型鸭----------
            我不会飞
            使用火箭推进飞行
         */
    }

    private static void printInfo(String info) {
        System.out.println("----------" + info + "----------");
    }
}
