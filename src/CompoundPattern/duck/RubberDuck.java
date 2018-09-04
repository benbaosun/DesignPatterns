package CompoundPattern.duck;

import CompoundPattern.pattern.observer.Observable;
import CompoundPattern.pattern.observer.Observer;
import CompoundPattern.quack.Quackable;

/**
 * @author lkmc2
 * @date 2018/9/4
 * @description 橡皮鸭
 */
public class RubberDuck implements Quackable {
    private Observable observable; // 主题

    public RubberDuck() {
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("我会哇哇叫");
        notifyObservers(); // 通知数据改变
    }

    @Override
    public void registerObserver(Observer observer) {
        // 注册观察者
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        // 通知观察者数据改变
        observable.notifyObservers();
    }
}
