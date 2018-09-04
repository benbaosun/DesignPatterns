package CompoundPattern.pattern.decorator;

import CompoundPattern.pattern.observer.Observable;
import CompoundPattern.pattern.observer.Observer;
import CompoundPattern.quack.Quackable;

/**
 * @author lkmc2
 * @date 2018/9/4
 * @description 叫声统计器（装饰器模式）
 */
public class QuackCounter implements Quackable {
    private Quackable duck; // 鸭子
    private static int numberOfQuacks; // 鸭子个数

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack(); // 叫唤
        numberOfQuacks++; // 鸭子个数加1
    }

    // 获取鸭子个数
    public static int getQuacks() {
        return numberOfQuacks;
    }

    @Override
    public void registerObserver(Observer observer) {
        // 注册观察者
        duck.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        // 通知观察者数据改变
        duck.notifyObservers();
    }
}
