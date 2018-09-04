package CompoundPattern.DuckDemo.pattern.factory;

import CompoundPattern.DuckDemo.duck.DuckCall;
import CompoundPattern.DuckDemo.duck.MallardDuck;
import CompoundPattern.DuckDemo.quack.Quackable;
import CompoundPattern.DuckDemo.duck.RedHeadDuck;
import CompoundPattern.DuckDemo.pattern.decorator.QuackCounter;

/**
 * @author lkmc2
 * @date 2018/9/4
 * @description 计算鸭子工厂（工厂模式）
 */
public class CountingDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedHeadDuck() {
        return new QuackCounter(new RedHeadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RedHeadDuck());
    }
}
