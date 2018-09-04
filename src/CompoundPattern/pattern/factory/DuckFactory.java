package CompoundPattern.pattern.factory;

import CompoundPattern.duck.DuckCall;
import CompoundPattern.duck.MallardDuck;
import CompoundPattern.quack.Quackable;
import CompoundPattern.duck.RedHeadDuck;

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
