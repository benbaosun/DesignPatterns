package CompoundPattern.DuckDemo.pattern.factory;

import CompoundPattern.DuckDemo.duck.DuckCall;
import CompoundPattern.DuckDemo.duck.MallardDuck;
import CompoundPattern.DuckDemo.quack.Quackable;
import CompoundPattern.DuckDemo.duck.RedHeadDuck;

/**
 * @author lkmc2
 * @date 2018/9/4
 * @description 鸭子工厂（工厂模式）
 */
public class DuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedHeadDuck() {
        return new RedHeadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RedHeadDuck();
    }
}
