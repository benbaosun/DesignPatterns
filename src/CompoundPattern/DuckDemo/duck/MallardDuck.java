package CompoundPattern.DuckDemo.duck;

import CompoundPattern.DuckDemo.pattern.observer.Observable;
import CompoundPattern.DuckDemo.pattern.observer.Observer;
import CompoundPattern.DuckDemo.quack.Quackable;

/**
 * @author lkmc2
 * @date 2018/9/4
 * @description 绿头鸭
 */
public class MallardDuck implements Quackable {
    private Observable observable; // 主题

    public MallardDuck() {
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("我会呱呱叫");
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
