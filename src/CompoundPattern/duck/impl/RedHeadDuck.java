package CompoundPattern.duck.impl;

import CompoundPattern.duck.Quackable;

/**
 * @author lkmc2
 * @date 2018/9/4
 * @description 红头鸭
 */
public class RedHeadDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("我会呱呱叫");
    }
}
