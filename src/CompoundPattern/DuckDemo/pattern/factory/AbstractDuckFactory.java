package CompoundPattern.DuckDemo.pattern.factory;

import CompoundPattern.DuckDemo.quack.Quackable;

/**
 * @author lkmc2
 * @date 2018/9/4
 * @description 抽象鸭子工厂（工厂模式）
 */
public abstract class AbstractDuckFactory {
    public abstract Quackable createMallardDuck(); // 创建绿头鸭
    public abstract Quackable createRedHeadDuck(); // 创建红头鸭
    public abstract Quackable createDuckCall(); // 创建鸭鸣器（机器）
    public abstract Quackable createRubberDuck(); // 创建橡皮鸭
}
