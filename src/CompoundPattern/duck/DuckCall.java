package CompoundPattern.duck;

/**
 * @author lkmc2
 * @date 2018/9/4
 * @description 鸭鸣器（机器）
 */
public class DuckCall implements Quackable {
    @Override
    public void quack() {
        System.out.println("我会咕咕叫");
    }
}
