package ObserverPattern;


/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 主题
 */

public interface Subject {
    /**
     * 注册观察者
     * @param observer 观察者
     */
    void registerObserver(Observer observer);
}
