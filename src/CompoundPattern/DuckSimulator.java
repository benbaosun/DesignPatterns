package CompoundPattern;

import CompoundPattern.duck.*;
import CompoundPattern.goose.Goose;
import CompoundPattern.pattern.adapter.GooseAdapter;
import CompoundPattern.pattern.composite.Flock;
import CompoundPattern.pattern.decorator.QuackCounter;
import CompoundPattern.pattern.factory.AbstractDuckFactory;
import CompoundPattern.pattern.factory.CountingDuckFactory;


/**
 * @author lkmc2
 * @date 2018/9/4
 * @description 鸭子模拟器
 */
public class DuckSimulator {

    public static void main(String[] args) {
        // 计算鸭子工厂
        AbstractDuckFactory duckFactory = new CountingDuckFactory();

        // 为鸭子添加叫唤统计器
        Quackable redHeadDuck = duckFactory.createRedHeadDuck(); // 红头鸭
        Quackable duckCall = duckFactory.createDuckCall(); // 鸭鸣器（机器）
        Quackable rubberDuck = duckFactory.createRubberDuck(); // 橡皮鸭

        // 不统计鹅的个数
        Quackable gooseDuck = new GooseAdapter(new Goose()); // 鹅（通过适配器转换）

        // 所有鸭子组合
        Flock flockOfDucks = new Flock();

        flockOfDucks.add(redHeadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        // 绿头鸭组合
        Flock flockOfMallards = new Flock();

        // 创建四只绿头鸭
        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();
        Quackable mallardFour = duckFactory.createMallardDuck();

        // 把绿头鸭放入绿头鸭组合
        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);

        // 绿头鸭组合放入所有鸭子组合
        flockOfDucks.add(flockOfMallards);

        simulate(flockOfDucks); // 测试所有鸭子叫唤

        System.out.println("--------------------------");

        simulate(flockOfMallards); // 只测试绿头鸭叫唤

        System.out.println("--------------------------");

        System.out.printf("鸭子一共叫唤了%d次", QuackCounter.getQuacks());
        /*
            运行结果：
            我会呱呱叫
            我会呱呱叫
            我会咕咕叫
            我会哇哇叫
            我会呼呼叫
            鸭子一共叫唤了4次
         */
    }

    private static void simulate(Quackable duck) {
        duck.quack(); // 让鸭子叫
    }

}
