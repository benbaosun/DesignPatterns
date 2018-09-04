package CompoundPattern.pattern.composite;

import CompoundPattern.pattern.observer.Observer;
import CompoundPattern.quack.Quackable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author lkmc2
 * @date 2018/9/4
 * @description 鸭子组合管理器（组合模式）
 */
public class Flock implements Quackable {
    private List<Quackable> quackerList = new ArrayList<>(); // 鸭子列表

    // 添加鸭子到列表
    public void add(Quackable quacker) {
        quackerList.add(quacker);
    }

    @Override
    public void quack() {
        // （迭代器模式）
        Iterator<Quackable> iterator = quackerList.iterator();

        // 让列表中的所有鸭子进行叫唤
        while (iterator.hasNext()) {
            Quackable quacker = iterator.next();
            quacker.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        // （迭代器模式）
        Iterator<Quackable> iterator = quackerList.iterator();

        // 让列表中的所有鸭子进行注册
        while (iterator.hasNext()) {
            Quackable quacker = iterator.next();
            // 注册观察者
            quacker.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {
        // 每个Quack都负责自己通知观察者，这里无需处理
    }
}
