package CompoundPattern.pattern.composite;

import CompoundPattern.duck.Quackable;

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
}
