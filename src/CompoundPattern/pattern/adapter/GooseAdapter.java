package CompoundPattern.pattern.adapter;

import CompoundPattern.pattern.observer.Observable;
import CompoundPattern.pattern.observer.Observer;
import CompoundPattern.quack.Quackable;
import CompoundPattern.goose.Goose;

/**
 * @author lkmc2
 * @date 2018/9/4
 * @description 鹅适配器（适配器模式）
 */
public class GooseAdapter implements Quackable {
    private Observable observable; // 主题
    private Goose goose; // 鹅

    public GooseAdapter(Goose goose) {
        this.goose = goose;
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        goose.honk(); // 叫唤
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
