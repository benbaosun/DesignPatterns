package CompoundPattern.DuckDemo.pattern.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author lkmc2
 * @date 2018/9/4
 * @description Subject主题（观察者模式）
 */
public class Observable implements QuackObservable {
    private List<Observer> observerList = new ArrayList<>(); // 观察者列表
    private QuackObservable duck; // 鸭子

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void notifyObservers() {
        // （迭代器模式）
        Iterator<Observer> iterator = observerList.iterator();

        // 通知所有观察者数据更新
        while (iterator.hasNext()) {
            Observer observer = iterator.next();
            observer.update(duck);
        }
    }
}
