package CompoundPattern;

import CompoundPattern.duck.DuckCall;
import CompoundPattern.duck.MallardDuck;
import CompoundPattern.duck.RedHeadDuck;
import CompoundPattern.duck.RubberDuck;


/**
 * @author lkmc2
 * @date 2018/9/4
 * @description 鸭子模拟器
 */
public class DuckSimulator {

    public static void main(String[] args) {
        Quackable mallardDuck = new MallardDuck(); // 绿头鸭
        Quackable redHeadDuck = new RedHeadDuck(); // 红头鸭
        Quackable duckCall = new DuckCall(); // 鸭鸣器（机器）
        Quackable rubberDuck = new RubberDuck(); // 橡皮鸭

        simulate(mallardDuck); // 让鸭子叫
        simulate(redHeadDuck);
        simulate(duckCall);
        simulate(rubberDuck);

        /*
            运行结果：
            我会呱呱叫
            我会呱呱叫
            我会咕咕叫
            我会哇哇叫
         */
    }

    private static void simulate(Quackable duck) {
        duck.quack(); // 让鸭子叫
    }

}
