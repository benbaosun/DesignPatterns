package ApapterPattern;

import ApapterPattern.duck.Duck;
import ApapterPattern.duck.MallardDuck;
import ApapterPattern.turkey.WildTurkey;

/**
 * @author lkmc2
 * @date 2018/9/2
 * @description 适配器测试类
 */
public class AdapterTest {

    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck(); // 绿头鸭
        WildTurkey turkey = new WildTurkey(); // 火鸡

        // 将火鸡冒充成鸭子
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("街头顽禽说：");
        turkey.gobble(); // 咯咯叫
        turkey.fly(); // 飞行

        System.out.println("\n鸭子说：");
        testDuck(duck);

        System.out.println("\n冒充成鸭子的街头顽禽说：");
        testDuck(turkeyAdapter);

        /*
            运行结果：
            街头顽禽说：
            咯咯叫
            我会飞

            鸭子说：
            呱呱叫
            我会飞

            冒充成鸭子的街头顽禽说：
            咯咯叫
            我会飞
            我会飞
            我会飞
            我会飞
            我会飞
         */

    }

    // 测试鸭子类
    private static void testDuck(Duck duck) {
        duck.quack(); // 叫唤
        duck.fly(); // 飞行
    }

}
