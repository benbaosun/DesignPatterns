package CompoundPattern.DuckDemo.pattern.observer;

/**
 * @author lkmc2
 * @date 2018/9/4
 * @description 观察者
 */
public interface Observer {
    // 更新
    void update(QuackObservable duck);
}
