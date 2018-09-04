package CompoundPattern.quack;

import CompoundPattern.pattern.observer.QuackObservable;

/**
 * Created by lkmc2 on 2018/6/25.
 * 叫唤行为
 */

public interface Quackable extends QuackObservable {
    void quack();
}
