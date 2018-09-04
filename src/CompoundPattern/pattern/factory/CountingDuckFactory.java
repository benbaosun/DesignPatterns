package CompoundPattern.pattern.factory;

import CompoundPattern.duck.DuckCall;
import CompoundPattern.duck.MallardDuck;
import CompoundPattern.duck.Quackable;
import CompoundPattern.duck.RedHeadDuck;
import CompoundPattern.pattern.decorator.QuackCounter;

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
