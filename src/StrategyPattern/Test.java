package StrategyPattern;

/**
 * Created by lkmc2 on 2018/6/25.
 * 测试类
 */

public class Test {
    public static void main(String[] args) {
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        printInfo("红头鸭");
        redHeadDuck.swim();
        redHeadDuck.display();
        redHeadDuck.performFly();
        redHeadDuck.performQuack();
        /*
            运行结果：
            ----------红头鸭----------
            我会游泳
            我是红头鸭
            我会飞
            我会呱呱叫
         */

        printInfo("绿头鸭");
        GreenHeadDuck greenHeadDuck = new GreenHeadDuck();
        greenHeadDuck.swim();
        greenHeadDuck.display();
        greenHeadDuck.performFly();
        greenHeadDuck.performQuack();
        /*
            运行结果：
            ----------绿头鸭----------
            我会游泳
            我是绿头鸭
            我会飞
            我会呱呱叫
         */

        printInfo("橡皮鸭");
        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.swim();
        rubberDuck.display();
        rubberDuck.performQuack();
        /*
            运行结果：
            ----------橡皮鸭----------
            我会吱吱叫
            我会游泳
            我是橡皮鸭
            我会吱吱叫
         */

        printInfo("诱饵鸭");
        DecoyDuck decoyDuck = new DecoyDuck();
        decoyDuck.swim();
        decoyDuck.display();
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
