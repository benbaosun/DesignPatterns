package CompoundPattern.duck;

import CompoundPattern.Quackable;

/**
 * @author lkmc2
 * @date 2018/9/4
 * @description 橡皮鸭
 */
public class RubberDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("我会哇哇叫");
    }
}
