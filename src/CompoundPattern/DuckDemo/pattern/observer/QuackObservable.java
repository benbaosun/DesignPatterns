package CompoundPattern.DuckDemo.pattern.observer;



/**
 * @author lkmc2
 * @date 2018/9/4
 * @description 叫唤观察者
 */
public interface QuackObservable {
    // 注册观察者
    void registerObserver(Observer observer);
    // 通知观察者数据改变
    void notifyObservers();
}
